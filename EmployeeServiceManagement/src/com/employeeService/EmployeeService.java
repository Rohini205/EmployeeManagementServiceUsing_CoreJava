package com.employeeService;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(101, "Shital", 24, "Developer", "IT", 25000);
	Employee emp2=new Employee(102, "Meena", 26, "Tester", "CO", 57000);
	Employee emp3=new Employee(103, "Bob", 24, "Devops", "Admin", 5000);
	Employee emp4=new Employee(104, "Max", 27, "System", "IT", 70000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	String designation;
	String department;
	double salary;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	//view all employee
	public void ViewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view employee based on the id
	public void ViewEmp() {
			System.out.println("Enter the id >>");
			id=sc.nextInt();
			for(Employee emp:empset) {
				if(emp.getId()==id) {
					System.out.println(emp);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee is not found");
			}
			
	}
	//Update employee
	public void updateEmployee() {
		
		System.out.println("Enter the  id");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name>>");
				name=sc.next();
				System.out.println("Enter salary>>");
				salary=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("updated details of the emploee:");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}else {
			System.out.println("Employee details was updated sucessfully");
		}
				
	}
	//delete employee
	public void deleteEmployee() {
		boolean found= false;
		System.out.println("Enter the id:");
	    id=sc.nextInt();
	    Employee empdelete=null;
	    
	    for(Employee emp:empset) {
	    	
	    	if(emp.getId()==id) {
	    		empdelete=emp;
	    		found=true;
	    	}
	    	
	    }
	    if(!found) {
	    	System.out.println("Employee data is not present");
	    }
	    else {
	    	empset.remove(empdelete);
	    	System.out.println("Employee deleted sucessfully");
	    }
	    	
	    	
	    }
	//Add employee
    public void addEmp() {
	}
	
}
