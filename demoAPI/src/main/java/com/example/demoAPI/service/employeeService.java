package com.example.demoAPI.service;

import java.util.List;

import com.example.demoAPI.dto.employeeDto;

public interface employeeService {
	
	public List<employeeDto> getallEmployee();
	public  Integer addemployee(employeeDto employee);
	public void deleteemployee(Integer Id);
	public String updateemployee(Integer Id,String email);
	public employeeDto getemployee(Integer Id);

}
