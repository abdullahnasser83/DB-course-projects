package com.uwasa.DB_JPA_MYSQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uwasa.DB_JPA_MYSQL.entities.department;
import com.uwasa.DB_JPA_MYSQL.entities.employee;

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
        department dept = new department();        
        dept.setDepatrment_name("Accounting");
        dept.setLoc("Vaasa");
        

    	employee emp1 = new employee();
        emp1.setFirst_name("John");
        emp1.setLast_name("Pett");
        emp1.setDepartment(dept);
        
    	employee emp2 = new employee();
        emp2.setFirst_name("Jack");
        emp2.setLast_name("Too");        
        emp2.setDepartment(dept);
        
        
        em.persist(dept);
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
