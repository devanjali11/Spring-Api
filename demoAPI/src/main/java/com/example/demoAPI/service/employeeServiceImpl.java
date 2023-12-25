package com.example.demoAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.example.demoAPI.dto.employeeDto;
import com.example.demoAPI.entity.employee;
import com.example.demoAPI.repository.employeeRepo;

@Service
public class employeeServiceImpl implements employeeService{

	@Autowired
	public employeeRepo employeerepo;
	
	@Override
	public List<employeeDto> getallEmployee() {
		// TODO Auto-generated method stub
		Iterable<employee> emp=employeerepo.findAll();
		
		List<employeeDto> empdto=new ArrayList<>();
		
		emp.forEach(employees->{
			
			employeeDto empdto2=new employeeDto();
			empdto2.setId(employees.getId());
			empdto2.setName(employees.getName());
			empdto2.setEmail(employees.getEmail());
			
			
			empdto.add(empdto2);
			
			
		});
		return empdto;
		
	
	}

	@Override
	public Integer addemployee(employeeDto employee) {
		// TODO Auto-generated method stub
		
		
	employee empdto=new employee();
	empdto.setEmail(employee.getEmail());
	empdto.setId(employee.getId());
	empdto.setName(employee.getName());
		
employee e=new employee();
e=employeerepo.save(empdto);
return e.getId();

}

	@Override
	public void deleteemployee(Integer Id) {
		// TODO Auto-generated method stub
		employeerepo.deleteById(Id);
		
	}

	@Override
	public employeeDto getemployee(Integer Id) {
		// TODO Auto-generated method stub
		Optional<employee> e=employeerepo.findById(Id);
		employee e1=e.orElseThrow();
		
		employeeDto ed=new employeeDto();
		
		ed.setId(e1.getId());
		ed.setEmail(e1.getEmail());
		ed.setName(e1.getName());
		return ed;
	}

	@Override
	public String updateemployee(Integer Id, String email) {
		// TODO Auto-generated method stub
		
		Optional<employee> e=employeerepo.findById(Id);
		
		employee e1=e.orElseThrow();
		String r1=e1.getEmail();
		e1.setEmail(email);
		return e1.getEmail()+r1;
		
	}

	

}

