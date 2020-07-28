package net.javaguides.springboot.springsecurity.web;

import javax.validation.Valid;

import net.javaguides.springboot.springsecurity.service.CustomerService;
import net.javaguides.springboot.springsecurity.web.dto.CustomerDto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customers")
public class CustomerController {

    
    @Autowired
	private CustomerService customerService;

    @ModelAttribute("newcustomer")
    public CustomerDto customerDto() {
        return new CustomerDto();
    }

	/*
	 * @GetMapping public ResponseEntity<Object> getCustomers(){ List<Customer>
	 * customerList = customerService.getCustomers(); return new
	 * ResponseEntity<>(customerList, HttpStatus.OK); }
	 */

    @GetMapping
    public String showForm(Model model) {
        return "customers";
    }
    
    @PostMapping
    public String createCustomer(@ModelAttribute("newcustomer") @Valid CustomerDto customerDto,
                                      BindingResult result){

    	customerService.save(customerDto);
        return "redirect:/customers?success";
    }



}
