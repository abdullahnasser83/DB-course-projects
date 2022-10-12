package com.uwasa.DB_JPA_MYSQL.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	private String first_name;
	private String last_name;
	
    @ManyToMany(mappedBy="employee")
    private Set<Project> project = new HashSet<>();


	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public Set<Project> getProject() {
		return project;
	}


	public void setProject(Set<Project> project) {
		this.project = project;
	}
	
//	@ManyToOne
//    @JoinColumn(name="department_id", nullable=false)
//    private Project department;
	



	
	
}
