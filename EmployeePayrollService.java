package EmployeePayroll;

import java.util.Scanner;

public class EmployeePayrollService {
	
	public static void main(String[] args) {
		
		int id;
		String name;
		int salary;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Employee Payroll Id");
		id = scan.nextInt();
		System.out.println("Enter your name");
		name = scan.next();
		System.out.println("Enter the salary");
		salary = scan.nextInt();
		
		System.out.println("\nEmployee Payroll is : ");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);

	}

}
