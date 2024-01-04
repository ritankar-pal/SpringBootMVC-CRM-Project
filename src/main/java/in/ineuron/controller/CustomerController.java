package in.ineuron.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ineuron.model.Customer;
import in.ineuron.service.ICustomerService;
import jakarta.annotation.PostConstruct;


@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	
	@GetMapping(value = "/list")
	public String listCustomers(Map<String, Object> map) {
		
		//Retrieving:
		List<Customer> customers = service.getCustomers();
		customers.forEach(System.out::println);
		
		map.put("customers", customers);
		
		return "list-customers";
	}
	
	@GetMapping(value = "/showForm")
	public String showFormForAdd(Map<String, Object> map) {
		
		Customer customer = new Customer();
		map.put("customer", customer);
		
		return "customer-form";
	}
	
	@PostMapping(value = "/saveCustomer")
	public String saveCustomer(@ModelAttribute(value = "customer")Customer customer) {
		System.out.println(customer);
		
		//Inserting in the DataBase:
		service.saveCustomer(customer);
		
		return "redirect:/customer/list";
	}
	
}
