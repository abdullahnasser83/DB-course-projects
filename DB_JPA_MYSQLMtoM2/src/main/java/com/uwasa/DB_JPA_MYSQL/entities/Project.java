package com.uwasa.DB_JPA_MYSQL.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Project  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PROJECT_ID;
	private String PROJECT_NAME;
	
	
//	  @ManyToMany(fetch = FetchType.LAZY,
//		      cascade = {
//		          CascadeType.PERSIST,
//		          CascadeType.MERGE
//		      },
//		      mappedBy = "project")
	
    @JoinTable(name = "project_employee", 
    joinColumns = {
    @JoinColumn(name = "PROJECT_ID", referencedColumnName = "PROJECT_ID")}, 
    inverseJoinColumns = {
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")})
    
   @ManyToMany()
    //private List<Employee> Employee;
    private Set<Employee> employee;


	public int getPROJECT_ID() {
		return PROJECT_ID;
	}



	public void setPROJECT_ID(int pROJECT_ID) {
		PROJECT_ID = pROJECT_ID;
	}



	public String getPROJECT_NAME() {
		return PROJECT_NAME;
	}



	public void setPROJECT_NAME(String pROJECT_NAME) {
		PROJECT_NAME = pROJECT_NAME;
	}



	public Set<Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}







	

}
