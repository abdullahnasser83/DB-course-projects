package com.uwasa.DB_JPA_MYSQL.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_id;
	private String department_name;
	private String loc;
	
 
    @OneToMany(mappedBy="department")
    private List<employee> employee;
	


	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepatrment_name() {
		return department_name;
	}
	public void setDepatrment_name(String depatrment_name) {
		this.department_name = depatrment_name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
