package com.employeeService;

import java.util.Scanner;

public class Main {
	
	EmployeeService service=new EmployeeService();
	static boolean ordering;
	
	public static void menu() {
		
		System.out.println("**********************Welcom To EmployeeService MAnagement Syetem*************"
				+ "\n1.Add Employee"
				+ "\n2.View Employee"
				+ "\n3.update Employee"
				+ "\n4.Delete Employee"
				+ "\n5.View All Employee"
				+ "\n5.Exit Employee");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		
		
		do {
			menu();
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				break;
			case 2:
				
				System.out.println("view Employee");
				service.ViewEmp();
				break;
			case 3:
				System.out.println("update Employee");
				service.updateEmployee();
				break;
			case 4:
				System.out.println("delete Employee");
				service.deleteEmployee();
				break;
			case 5:
				System.out.println("View all Employee");
				service.ViewAllEmps();

				break;
			case 6:
				System.out.println("Thanks for Employee using our application");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the valid choice");
				break;
			
			}
			
		}while(ordering);
		
	}

}
