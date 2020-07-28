package net.javaguides.springboot.springsecurity.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.javaguides.springboot.springsecurity.repository.NewCustomerRepository;
import net.javaguides.springboot.springsecurity.service.AccountService;
import net.javaguides.springboot.springsecurity.web.dto.AccountDto;

@Controller
public class CustomerAccountsController {
	
	 @Autowired
		private NewCustomerRepository newcustomerRepository;
	 
	 @Autowired
		private AccountService accountService;


	 @RequestMapping(value="/createaccount", method = RequestMethod.GET)
	    public String showForm(Model model) {
	    	 model.addAttribute("users", newcustomerRepository.findAll());
	    	 
	         return "/createaccount";
	    }
	 
	 
	 @RequestMapping(value="/createaccount", method = RequestMethod.POST)
	    public String createCustomer(@ModelAttribute("accounts") @Valid AccountDto accountDto,
	                                      BindingResult result){

		 accountService.save(accountDto);
	        return "redirect:/createaccount?success";
	    }


}
