package com.example.demoAPI.dto;

public class employeeDto {

	
	public Integer Id;
	public String name;
	public String email;
	
	

	public employeeDto() {
		super();
	}
	public employeeDto(Integer id, String name, String email) {
		super();
		this.Id = id;
		this.name = name;
		this.email = email;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
