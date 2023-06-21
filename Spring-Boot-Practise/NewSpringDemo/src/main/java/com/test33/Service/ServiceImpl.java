package com.test33.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test33.Entity.Employee;
import com.test33.Repository.MyRepository;
import com.test33.customException.NoEmployeeFoundException;
import com.test33.customException.NoIdFoundException;

@Service
public class ServiceImpl implements MyService {
	@Autowired
	public MyRepository myRepo;
	
	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Integer> opt=Optional.of(id);
		if(opt.isPresent() && myRepo.existsById(id)) {
				return myRepo.findById(id).get();
		}
		else {
			throw new NoIdFoundException("No id found in this request.");
		}
		
	}

	@Override
	public Employee addEmployee(Employee emp) {
		if(emp==null) { throw new NoEmployeeFoundException("No employee found in request body."); }
		return myRepo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Optional<Integer> givenId=Optional.of(emp.getId());
		if(givenId.isPresent()) {
			if( myRepo.existsById(givenId.get()) ) { 
				Employee found=myRepo.findById(givenId.get()).get();
				found.setName(emp.getName());
				found.setRollNo(emp.getRollNo());
				found.setAddress(emp.getAddress());
				found.setEmail(emp.getEmail());
				myRepo.save(found);
				return found;
			}
			else {
				System.out.println("no id");
				throw new NoIdFoundException("No id found");
			}
		}
		else{
			System.out.println("empty body of employee");
			throw new NoEmployeeFoundException("No employee found in request body.");
		}
//		System.out.println("No such employee found");
//		if(emp==null) {   }
//		return null;
	}

	@Override
	public String deleteEmployee(Integer id) {
//		Optional<Integer> opt=Optional.of(id);
//		if(opt.isPresent()) {
		if(myRepo.existsById(id)) {
			myRepo.deleteById(id);
			System.out.println("hello");
			return "The employee with id : " + id + "is deleted."; 
		}
		else {
			throw new NoIdFoundException("No id found"); 
		}
//		return "The employee with id : " + id + "doesn't exist."; 
	}
	
}
