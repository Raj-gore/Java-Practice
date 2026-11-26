package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HBUtils.sf.openSession();
    	Transaction tx = session.beginTransaction();
    			
    	Employee e = new Employee();
    	e.setName("John Pathak");
    	e.setCompany("tcs");
    	e.setDesignation("ui developer");
    	e.setSalary(22000);
    	
    	session.save(e);
    	
    	tx.commit();
    	session.close();
    	
    	
    }
}
