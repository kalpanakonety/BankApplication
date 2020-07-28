package net.javaguides.springboot.springsecurity.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerViewController {

	@RequestMapping("/manage")
	public String viewCustomers()
	{
		return "manage";
	}
    
    @RequestMapping("/add-customers")
	public String addCustomers()
	{
		return "add-customers";
	}
    
	@RequestMapping("/customers")
	public String createNewCustomer()
	{
		return "customers";
	}
}
