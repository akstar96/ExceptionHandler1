package com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Exception.StudentNotFoundException;
import com.model.Emp;
import com.services.Services;		
//https://github.com/in28minutes/spring-boot-examples/tree/master/spring-boot-2-rest-service-exception-handling
//internate sources code
@RestController
public class Homecontroller {
	@Autowired
	private Services ser;
	
	@PostMapping("/add")
	public  ResponseEntity<Emp> AddEmp(@Valid @RequestBody Emp emp){
		ser.AddEmp(emp);
		return new ResponseEntity(emp,HttpStatus.OK); 		
	}
	
	@GetMapping("/Emp")
	public List<Emp> getAll(){
		return ser.getAllEmp();
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Emp> GetById(@PathVariable Long id){
		Optional<Emp> emp1 =ser.FindById(id);
		if(!emp1.isPresent()) {
			throw new StudentNotFoundException("Requested Emp not found :"+"id"+id);	}
		return new ResponseEntity(emp1, HttpStatus.OK);
		
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Emp> updateEmp(@RequestBody Emp emp, @PathVariable Long id){
		Optional<Emp> emp1=ser.FindById(id);
		if(!emp1.isPresent()) {
			throw new StudentNotFoundException("Requested Emp not found :"+"id"+id);
			
		}
		ser.updateEmp(emp, id);
		return new ResponseEntity(emp1,HttpStatus.ACCEPTED);
	}
	
	
}
