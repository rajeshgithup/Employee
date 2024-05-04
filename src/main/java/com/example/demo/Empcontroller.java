package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Empcontroller {
	@Autowired EmpService es;
	@PostMapping("/newemp")
	public String saveemp(@RequestBody Employee e) {
		return es.saveemp(e);
	}
	@PostMapping("/find")
	public String emplist(@RequestBody List<Employee>e) {
	return es.emplist(e);
	
}
	@GetMapping("/findnum/{a}")
	public Optional<Employee> findnum(@PathVariable int a) {
		return es.findnum(a);
	}
	@DeleteMapping("/delid/{id}")
	public String delid(@PathVariable int id) {
		return es.delid(id);
	}
	@GetMapping("/findall")
	public List<Employee> findall() {
		return es.findall();
	}
	@PutMapping("/updateemp/{id}")
	public String change(@PathVariable int id,@RequestBody Employee e) {
		return es.change(id, e);
	}
	@PatchMapping("/patch/{id}")
	public String patch(@PathVariable int id,@RequestBody Employee e) {
		return es.patch(id,e);
	}
	
}
