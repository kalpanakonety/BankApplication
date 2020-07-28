package net.javaguides.springboot.springsecurity.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import net.javaguides.springboot.springsecurity.model.Customer;

public class CustomerRowMapper implements RowMapper<Customer>
{

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Customer customer = new Customer();
		customer.setId(rs.getLong("ID"));
		customer.setFirstname(rs.getString("FIRST_NAME"));
		customer.setLastname(rs.getString("LAST_NAME"));
		customer.setAddress(rs.getString("ADDRESS"));
		customer.setPhone(rs.getString("PHONE"));
		customer.setPpsnum(rs.getString("PPSNUM"));
		return customer;
	}
	
	

}
