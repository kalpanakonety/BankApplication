package net.javaguides.springboot.springsecurity.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.javaguides.springboot.springsecurity.repository.NewCustomerRepository;
import net.javaguides.springboot.springsecurity.service.CustomerService;
import net.javaguides.springboot.springsecurity.web.dto.CustomerDto;

@Controller
public class ManageCustomersController {

	  @Autowired
		private CustomerService customerService;
	  
	  @Autowired
		private NewCustomerRepository newcustomerRepository;


	    @ModelAttribute("newcustomer")
	    public CustomerDto customerDto() {
	        return new CustomerDto();
	    }
	    
	    @RequestMapping(value="/manage", method = RequestMethod.GET)
	    public String showForm(Model model) {
	    	 model.addAttribute("newcustomer", newcustomerRepository.findAll());
	         return "/manage";
	    }
	    
	    @RequestMapping(value="/empUpdateToEdit", method = RequestMethod.POST)
	    public String empUpdateEdit(@ModelAttribute(value="newcustomer") CustomerDto customerDto, Model model) {
	        model.addAttribute("newcustomer", customerDto);
	        return "customerUpdate"; 
	    }
	    
	    @RequestMapping("/customerUpdate")
	    public String empUpdate(CustomerDto customerDto) {
	     	customerService.update(customerDto);
	    	return "redirect:/manage";
	    }
	    
	    @RequestMapping(value="/empUpdateToDelete", method = RequestMethod.POST)
	    public String empUpdateDelete(@ModelAttribute(value="newcustomer") CustomerDto customerDto, Model model) {
	    	customerService.delete(customerDto);
	    	return "redirect:/manage";
	    }
	    

	  
}
