package net.javaguides.springboot.springsecurity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import net.javaguides.springboot.springsecurity.repository.UserRepository;
import net.javaguides.springboot.springsecurity.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserService service;
	
	@MockBean
	private UserRepository userrepo;
	
	@Test
	public void findbyEmailTest() {
		
		
	}
	
	public void saveTest() {
	//	when(userrepo.findAll()).thenReturn(Stream.of(arg0))

	//	assertEquals();
	}
	
}
