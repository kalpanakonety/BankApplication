package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import net.javaguides.springboot.springsecurity.model.Customer;
import net.javaguides.springboot.springsecurity.model.NewCustomer;
import net.javaguides.springboot.springsecurity.web.dto.CustomerDto;

public interface CustomerService
{
	NewCustomer save(CustomerDto customer);
	public List<Customer> getCustomers();
	public  void deleteCustomer(CustomerDto customer);
	NewCustomer update(CustomerDto customerDto);
	void delete(CustomerDto customerDto);
}
