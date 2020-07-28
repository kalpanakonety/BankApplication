package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.model.Customer;
import net.javaguides.springboot.springsecurity.model.NewCustomer;
import net.javaguides.springboot.springsecurity.repository.CustomerRepository;
import net.javaguides.springboot.springsecurity.repository.NewCustomerRepository;
import net.javaguides.springboot.springsecurity.web.dto.CustomerDto;


@Service
public class CustomerServiceImpl implements CustomerService
{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private NewCustomerRepository newcustomerRepository;

		
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}

	public NewCustomer save(CustomerDto customer) {

	        NewCustomer customer1 = new NewCustomer();
	        customer1.setFirstName(customer.getFirstName());
	        customer1.setLastName(customer.getLastName());
	        customer1.setAddress(customer.getAddress());
	        customer1.setPhone(customer.getPhone());
	        customer1.setPpsnum(customer.getPpsnum());
	        return newcustomerRepository.save(customer1);
	    }
	
	public NewCustomer update(CustomerDto customer) {

		NewCustomer cust =  newcustomerRepository.findAllById(customer.getId());
		NewCustomer customer1 = new NewCustomer();
		customer1.setId(cust.getId());
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setAddress(customer.getAddress());
        customer1.setPhone(customer.getPhone());
        customer1.setPpsnum(customer.getPpsnum());
        return newcustomerRepository.save(customer1);
    }
	
	public void delete(CustomerDto customer) {

		NewCustomer cust =  newcustomerRepository.findAllById(customer.getId());
		NewCustomer customer1 = new NewCustomer();
		customer1.setId(cust.getId());
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setAddress(customer.getAddress());
        customer1.setPhone(customer.getPhone());
        customer1.setPpsnum(customer.getPpsnum());
        newcustomerRepository.delete(customer1);
    }

	
	public void deleteCustomer(CustomerDto customer) {
		   NewCustomer customer1 = new NewCustomer();
	        customer1.setFirstName(customer.getFirstName());
	        customer1.setLastName(customer.getLastName());
	        customer1.setAddress(customer.getAddress());
	        customer1.setPhone(customer.getPhone());
	        customer1.setPpsnum(customer.getPpsnum());
	        newcustomerRepository.delete(customer1);
	}

	
}