package com.example.demoAPI.entity;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class employee {
	@Id
	private Integer Id;
	private String name;
	private String email;
	
	
	public employee() {
		super();
	}
	public employee(Integer id, String name, String email) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
