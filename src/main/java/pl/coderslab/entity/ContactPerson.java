package pl.coderslab.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;


@Data
@Entity
public class ContactPerson {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
	private String firstname;
	
	@NotBlank
	private String lastname;
	
	@Email
    private String email;
	
	private String phone;
	
	
	public String getName() {
		return getFirstname() +" "+ getLastname();
	}

}
