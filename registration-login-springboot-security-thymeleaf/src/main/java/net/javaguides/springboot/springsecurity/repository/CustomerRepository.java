package net.javaguides.springboot.springsecurity.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.springboot.springsecurity.mapper.CustomerRowMapper;
import net.javaguides.springboot.springsecurity.model.Customer;

@Repository
public class CustomerRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(readOnly = true)
	public List<Customer> getCustomers()
	{
		return jdbcTemplate.query("select * from New_customer", new CustomerRowMapper());
	}

}
