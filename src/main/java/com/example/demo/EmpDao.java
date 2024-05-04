package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@Repository
public class EmpDao {
	@Autowired EmpRepository re;
	public String saveemp(Employee e) {
	re.save(e);
		return "emp saved";
	}
	public String emplist(List <Employee>e) {
	re.saveAll(e);
	return "Allsaved";
}
	public Optional<Employee> findnum(int a) {
		return re.findById(a);
	}
	public String delid(int id) {
		re.deleteById(id);
		return "del id";
		
	}
	public List<Employee> findall() {
	return	re.findAll();
	
	}
	public String change(int id,Employee e) {
		Employee x=re.findById(id).get();
		x.setName(e.getName());
		x.setAge(e.getAge());
		re.save(x);
		return "updated";
	}
	public String patch(int id,Employee e) {
		Employee x=re.findById(id).get();
		x.setName(e.getName());
		x.setAge(e.getAge());
		re.save(x);
         return "patch completed";		
	}

}
