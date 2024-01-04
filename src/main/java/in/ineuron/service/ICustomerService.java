package in.ineuron.service;
import java.util.List;
import in.ineuron.model.Customer;


public interface ICustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
}
