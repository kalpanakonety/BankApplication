package net.javaguides.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springsecurity.model.CustomerAccount;
@Repository
public interface AccountRepository extends JpaRepository<CustomerAccount, Long> {
	
	CustomerAccount findAllById(Long id);
	
	
}
