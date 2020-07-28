package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.model.CustomerAccount;
import net.javaguides.springboot.springsecurity.web.dto.AccountDto;

public interface AccountService {

	CustomerAccount save(AccountDto account);

	CustomerAccount update(AccountDto accountDto);

	void delete(AccountDto accountDto);
	
}
