package net.javaguides.springboot.springsecurity.web.dto;

import javax.validation.constraints.NotEmpty;

import net.javaguides.springboot.springsecurity.constraint.FieldMatch;
@FieldMatch.List({
    @FieldMatch(first = "phone", second = "confirmphone", message = "The phone fields must match"),
    @FieldMatch(first = "ppsnum", second = "confirmppsnum", message = "The ppsnum fields must match")
})
public class CustomerDto {

	private Long id;
	 
	@NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String address;

    @NotEmpty
    private String phone;

    @NotEmpty
    private String ppsnum;
    
    
    
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

  
}
