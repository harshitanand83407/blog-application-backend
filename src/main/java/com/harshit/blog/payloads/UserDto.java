package com.harshit.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	private int id;
	@NotEmpty
	@Size(min=4,message="username must be mininmun of 4 characters")
	private String name;
	@Email
	private String email;
	@NotEmpty
	@Size(min=3,max=10,message="password must me more that 3 and less than 10")
	
	private String password;
	@NotEmpty
	private String about;
	
	
}
