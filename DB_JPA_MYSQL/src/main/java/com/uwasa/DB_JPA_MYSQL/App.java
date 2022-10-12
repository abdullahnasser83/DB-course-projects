package com.uwasa.DB_JPA_MYSQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uwasa.DB_JPA_MYSQL.entities.employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        employee emp = new employee();
        emp.setFirst_name("John");
        emp.setLast_name("Pett");
        
      	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
      	EntityManager em = emf.createEntityManager();
      	System.out.println(emp);
      	
      	// add employee emp
      	// after creating the emp object we can persist
//      	em.getTransaction().begin();
//      	em.persist(emp);
//      	em.getTransaction().commit();
      	
      	// find byId
      	emp= em.find(employee.class, 5);
      	System.out.println(emp.toString());
        
      	
      	// delete 
      	// first we need to find the entity
//      	em.getTransaction().begin();
//      	emp= em.find(employee.class, 32);
//      	em.remove(emp);
//      	System.out.println( emp.toString()+" has been deleted...");
//      	em.getTransaction().commit();
      	
      	// update
      	// first we need to find the entity
      	em.getTransaction().begin();
		 emp =em.find(employee.class, 5);
		 System.out.println(emp.toString() + " BEFORE updated");
		 emp.setFirst_name("Nasser2");
		 emp=em.merge(emp);
		 em.getTransaction().commit();
		 System.out.println(emp.toString() + " has been updated");
      	
      	
   //   	em.getTransaction().commit();
    }
}
