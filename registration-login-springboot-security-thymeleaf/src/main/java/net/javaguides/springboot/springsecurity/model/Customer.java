package net.javaguides.springboot.springsecurity.model;

public class Customer {
	private Long id;
	private String firstname;
	private String lastname;
	private String phone;
	private String address;
	private String ppsnum;
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPpsnum() {
		return ppsnum;
	}

	public void setPpsnum(String ppsnum) {
		this.ppsnum = ppsnum;
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=\" + phone + \", ppsnum=\" + ppsnum + \", address=" + address
				+ "]";
	}
}
