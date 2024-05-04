package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmpService {
	@Autowired EmpDao ed;
	public String saveemp(Employee e) {
		return ed.saveemp(e);
	}
	public String emplist(@RequestBody List<Employee> e) {
		return ed.emplist(e);
		
	}
	public Optional<Employee> findnum(@PathVariable int a) {
		return ed.findnum(a);
	}
	public String delid(@PathVariable int id) {
		return ed.delid(id);
	}
	public List<Employee> findall() {
		return ed.findall();
	}
	@PutMapping("/updateemp/{id}")
	public String change(@PathVariable int id,@RequestBody Employee e) {
	return ed.change(id,e);		 
}
	public String patch(int id,Employee e) {
		return ed.patch(id,e);
}
}