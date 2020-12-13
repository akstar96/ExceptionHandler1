package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.Dao;
import com.model.Emp;

@Service
public class Services {
@Autowired 
private Dao dao;

public Emp AddEmp(Emp emp) {
	dao.save(emp);
	
	return emp;
	
}

public Optional<Emp> FindById(Long id) {
	Optional<Emp> emp=dao.findById(id);
	return emp;
	
	}

public List<Emp> getAllEmp(){

	List<Emp> emp=	dao.findAll();
	return emp;
}

public List<Emp> deleteEmp(long id) {
	 dao.deleteById(id);
	 List<Emp> emp=dao.findAll();
	return emp;
}


public Emp updateEmp(Emp emp ,Long id) {
	dao.findById(id);
	
	return dao.save(emp);
	
	
	
}
}
