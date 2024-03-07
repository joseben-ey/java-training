package com.ey.model;

import java.time.LocalDate;

public class Employee extends Person {
	Long EmpNo;
    String Job;
    Double Salary;
    Integer DeptNo;
    LocalDate HireDate;
    
	public Employee(){
		// TODO Auto-generated constructor stub

	    }

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

}
