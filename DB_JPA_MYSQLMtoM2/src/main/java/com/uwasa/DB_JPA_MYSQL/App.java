package com.uwasa.DB_JPA_MYSQL;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uwasa.DB_JPA_MYSQL.entities.Project;
import com.uwasa.DB_JPA_MYSQL.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        
      	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
      	EntityManager em = emf.createEntityManager();
      	//System.out.println(emp1);
      	
      	// add department and its employees emp
      	// after creating the emp object we can persist
      	em.getTransaction().begin();
        Project project1 = new Project();        
        project1.setPROJECT_NAME("Devloping Student system2");

        Project project2 = new Project();        
        project2.setPROJECT_NAME("Devloping Student system2");
        
        Set<Project> projects = new HashSet<Project>();
        projects.add(project1);
        projects.add(project2);
        
    	Employee emp1 = new Employee();
        emp1.setFirst_name("John");
        emp1.setLast_name("Pett2");

        
    	Employee emp2 = new Employee();
        emp2.setFirst_name("Jack");
        emp2.setLast_name("Too2");        

        Set<Employee> employees = new HashSet<Employee>();
        
        employees.add(emp2);
        employees.add(emp1);
        
        project1.setEmployee(employees);
        project2.setEmployee(employees);
        
        
        
        em.persist(project1);
        em.persist(project2);
        em.persist(emp1);
        em.persist(emp2);
        
//    	employee emp2 = new employee();
//        emp2.setFirst_name("Jack");
//        emp2.setLast_name("Too");
//      	emp2.setDepartment(dept);
//      	em.persist(emp2);
      	
      	em.getTransaction().commit();
      	
      	// find byId
//      	emp1= em.find(employee.class, 5);
//      	System.out.println(emp1.toString());
        
      	
      	// delete 
      	// first we need to find the entity
//      	em.getTransaction().begin();
//      	emp= em.find(employee.class, 32);
//      	em.remove(emp);
//      	System.out.println( emp.toString()+" has been deleted...");
//      	em.getTransaction().commit();
      	
      	// update
      	// first we need to find the entity
//      	em.getTransaction().begin();
//		 emp1 =em.find(employee.class, 5);
//		 System.out.println(emp1.toString() + " BEFORE updated");
//		 emp1.setFirst_name("Nasser");
//		 emp1=em.merge(emp1);
//		 em.getTransaction().commit();
//		 System.out.println(emp1.toString() + " has been updated");
      	
      	
   //   	em.getTransaction().commit();
    }
}
