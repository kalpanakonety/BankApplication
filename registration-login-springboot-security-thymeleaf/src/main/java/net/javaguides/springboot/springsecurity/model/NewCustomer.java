package net.javaguides.springboot.springsecurity.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class NewCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String ppsnum;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_accounts",
            joinColumns = @JoinColumn(
                    name = "newcustomer_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "customeraccount_id", referencedColumnName = "id"))
    private Collection<CustomerAccount> accounts;

    public NewCustomer() {
    }

    public NewCustomer(Long id, String firstName, String lastName, String address, String phone, String ppsnum) {
    	this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.ppsnum = ppsnum;
    }

    public NewCustomer(Long id,String firstName, String lastName, String address, String phone, String ppsnum, Collection<CustomerAccount> accounts) {
    	this.id=id;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.ppsnum = ppsnum;
        this.accounts = accounts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPpsnum() {
		return ppsnum;
	}

	public void setPpsnum(String ppsnum) {
		this.ppsnum = ppsnum;
	}

	public Collection<CustomerAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(Collection<CustomerAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
    public String toString() {
        return "NewCustomer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
