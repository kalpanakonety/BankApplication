package net.javaguides.springboot.springsecurity.web.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import net.javaguides.springboot.springsecurity.constraint.FieldMatch;


@FieldMatch.List({
    @FieldMatch(first = "phone", second = "confirmphone", message = "The phone fields must match"),
    @FieldMatch(first = "ppsnum", second = "confirmppsnum", message = "The ppsnum fields must match")
})
public class AccountDto {

	private Long id;
	 
	@NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String ppsnum;
    
    @NotEmpty
    private String type;
    
    @NotNull
    private BigDecimal amount;   
    
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


	public String getPpsnum() {
		return ppsnum;
	}

	public void setPpsnum(String ppsnum) {
		this.ppsnum = ppsnum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

  
}
