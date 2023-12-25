package com.example.demoAPI.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoAPI.dto.employeeDto;
import com.example.demoAPI.service.employeeService;

@RestController
@RequestMapping(value="/employees")
public class employeeAPI {
	
	@Autowired
	public employeeService employeeservice;
	
	@GetMapping(value="/getemployees")
	public ResponseEntity<List<employeeDto>> getallEmployee(){
		
		List<employeeDto> emp=employeeservice.getallEmployee();
		return new ResponseEntity<>(emp,HttpStatus.OK);
		
	}
	
	@PostMapping(value="/addemployee")
	public ResponseEntity<String> addemployee(@RequestBody employeeDto emp){
		
		Integer employeeId=employeeservice.addemployee(emp);
		String successmessage="added successfully: "+ employeeId;
		return new ResponseEntity<>(successmessage,HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/deleteemployee/{Id}")
	public void deleteemployee(@PathVariable Integer Id){
		
		employeeservice.deleteemployee(Id);
		
	}
	@PutMapping(value="/updateeemployee/{Id}")
	public ResponseEntity<String> updateemployee(@PathVariable Integer Id,@RequestBody String email){

		String e3=employeeservice.updateemployee(Id, email);
		String successmessage="employee details updated successfully with id:"+ Id;
		return new ResponseEntity<> (e3,HttpStatus.OK);
		
	}
	
	
	@GetMapping(value="/geteemployee/{Id}")
	public ResponseEntity<employeeDto> eemployeedetails(@PathVariable Integer Id){

		employeeDto e1=employeeservice.getemployee(Id);
		//String successmessage="employee details updated successfully with id:"+ Id;
		return new ResponseEntity<> (e1,HttpStatus.OK);
		
	}

}
