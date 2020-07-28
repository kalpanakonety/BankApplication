package net.javaguides.springboot.springsecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.javaguides.springboot.springsecurity.repository.AccountRepository;
import net.javaguides.springboot.springsecurity.service.AccountService;
import net.javaguides.springboot.springsecurity.web.dto.AccountDto;
import net.javaguides.springboot.springsecurity.web.dto.CustomerDto;

@Controller
public class ManageAccountsController {

	  @Autowired
		private AccountService accountService;
	  
	  @Autowired
		private AccountRepository accountRepository;


	    @ModelAttribute("newcustomer")
	    public CustomerDto customerDto() {
	        return new CustomerDto();
	    }
	    
	    @RequestMapping(value="/manageaccounts", method = RequestMethod.GET)
	    public String showForm(Model model) {
	    	 model.addAttribute("accounts", accountRepository.findAll());
	         return "/manageaccounts";
	    }
	    
	    @RequestMapping(value="/editAccount", method = RequestMethod.POST)
	    public String acctUpdateEdit(@ModelAttribute(value="accounts") AccountDto accountDto, Model model) {
	        model.addAttribute("accounts", accountDto);
	        return "accountUpdate"; 
	    }
	    
	    @RequestMapping("/accountUpdate")
	    public String acctUpdate(AccountDto accountDto) {
	    	accountService.update(accountDto);
	    	return "redirect:/manageaccounts";
	    }
	    
	    @RequestMapping(value="/deleteAccount", method = RequestMethod.POST)
	    public String acctUpdateDelete(@ModelAttribute(value="accounts") AccountDto accountDto, Model model) {
	    	accountService.delete(accountDto);
	    	return "redirect:/manageaccounts";
	    }
	    
	
	  
}
