package net.javaguides.springboot.springsecurity.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String ppsnum;
    private String type;
    private BigDecimal amount;

    public CustomerAccount() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPpsnum() {
		return ppsnum;
	}


	public void setPpsnum(String ppsnum) {
		this.ppsnum = ppsnum;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	@Override
    public String toString() {
        return "CustomerAccount{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                  ", ppsnum='" + ppsnum + '\'' +
                ", type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
