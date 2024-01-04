package in.ineuron.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICustomerDAO;
import in.ineuron.model.Customer;


@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDAO repo;
	
	
	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}


	@Override
	public void saveCustomer(Customer customer) {
		repo.save(customer);
	}

}
