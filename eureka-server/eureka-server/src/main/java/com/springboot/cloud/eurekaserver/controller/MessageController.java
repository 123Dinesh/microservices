package com.springboot.cloud.eurekaserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cloud.eurekaserver.model.Employee;



@RestController
@Api(value="online employee portal" , description="operations for getting employee details")
public class MessageController {

	private Map<Integer,Employee> empMap=new HashMap<Integer,Employee>();
	
public MessageController() {

	empMap.put(1, new Employee(1,"vinod","TCS"));
	empMap.put(2, new Employee(2,"dinesh","HCL"));
	empMap.put(3, new Employee(3,"tanvi","TCS"));
	empMap.put(4, new Employee(4,"varsha","HCL"));
	
}	

@ApiOperation(value = "View a list of employees",response = Iterable.class)
@RequestMapping(value="/employees" ,method=RequestMethod.GET, produces = "application/json" )
public List<Employee> getEmployes(){
	List<Employee> empList=new ArrayList<Employee>();
	for(Entry<Integer,Employee> entry:empMap.entrySet()){
		empList.add(entry.getValue());
	}
	return empList;
}
	
}
