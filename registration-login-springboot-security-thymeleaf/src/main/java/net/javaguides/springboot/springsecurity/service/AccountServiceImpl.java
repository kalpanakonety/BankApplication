package net.javaguides.springboot.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.model.CustomerAccount;
import net.javaguides.springboot.springsecurity.repository.AccountRepository;
import net.javaguides.springboot.springsecurity.web.dto.AccountDto;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public CustomerAccount save(AccountDto account) {
		
		CustomerAccount amt = new CustomerAccount();
        amt.setFirstName(account.getFirstName());
        amt.setLastName(account.getLastName());
        amt.setPpsnum(account.getPpsnum());
        amt.setType(account.getType());
        amt.setAmount(account.getAmount());
        
        return accountRepository.save(amt);
    }

	@Override
	public CustomerAccount update(AccountDto accountDto) {
		
		CustomerAccount acct =  accountRepository.findAllById(accountDto.getId());
		

		CustomerAccount customer1 = new CustomerAccount();
		customer1.setId(acct.getId());
        customer1.setFirstName(accountDto.getFirstName());
        customer1.setLastName(accountDto.getLastName());
        customer1.setType(accountDto.getType());
        customer1.setAmount(accountDto.getAmount());
        customer1.setPpsnum(accountDto.getPpsnum());
        return accountRepository.save(customer1);
		
	}

	@Override
	public void delete(AccountDto accountDto) {
		
		CustomerAccount cust =  accountRepository.findAllById(accountDto.getId());
		CustomerAccount customer1 = new CustomerAccount();
		customer1.setId(cust.getId());
        customer1.setFirstName(accountDto.getFirstName());
        customer1.setLastName(accountDto.getLastName());
        customer1.setType(accountDto.getType());
        customer1.setAmount(accountDto.getAmount());
        customer1.setPpsnum(accountDto.getPpsnum());
        accountRepository.delete(customer1);
		
	}

	public void deleteAccount(AccountDto accountDto) {
		
		CustomerAccount customer1 = new CustomerAccount();
	        customer1.setFirstName(accountDto.getFirstName());
	        customer1.setLastName(accountDto.getLastName());
	        customer1.setType(accountDto.getType());
	        customer1.setAmount(accountDto.getAmount());
	        customer1.setPpsnum(accountDto.getPpsnum());
	        accountRepository.delete(customer1);
	}
	
}
