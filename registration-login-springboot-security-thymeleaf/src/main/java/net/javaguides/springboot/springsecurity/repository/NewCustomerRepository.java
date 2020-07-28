package net.javaguides.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springsecurity.model.NewCustomer;

@Repository
public interface NewCustomerRepository extends JpaRepository<NewCustomer, Long> {
	NewCustomer findAllById(Long id);

	NewCustomer findByPpsnum(String ppsnum);
}
