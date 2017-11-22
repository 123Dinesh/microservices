package com.springboot.cloud.eurekaserver.model;

import io.swagger.annotations.ApiModelProperty;

public class Employee {
    
	@ApiModelProperty(notes="employee id", required=true)
	private int empId;
	
	@ApiModelProperty(notes="employee name", required=true)
	private String empName;

	@ApiModelProperty(notes="employee company", required=true)
	private String company;
	
	public Employee(int id,String name,String cmpy) {
	 
		this.company=cmpy;
		this.empId=id;
		this.empName=name;

	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
