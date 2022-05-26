package com.day7;
import java.util.*;
public class EmployeeMain {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Member mem=new Member();
		Manager mg=new Manager();
		System.out.println("This is Employee Details section");
		System.out.println("=====================================");
		
		System.out.println("Enter name");
		mg.name=sc.next();
		
		System.out.println("Enter age");
		mg.age=sc.nextInt();
		
		System.out.println("Enter phone number");
		mg.phoneNumber=sc.next();
		
		System.out.println("Enter address");
		mg.address=sc.next();
		
		System.out.println("Enter salary");
		mg.salary=sc.nextInt();
		
		mg.printDetail();
		
		
		Employee emp=new Employee();
		System.out.println("This is Employee Details section");
		System.out.println("=====================================");
		
		System.out.println("Enter name");
		emp.name=sc.next();
		
		System.out.println("Enter age");
		emp.age=sc.nextInt();
		
		System.out.println("Enter phone no.");
		emp.phoneNumber=sc.next();
		
		System.out.println("Enter address");
		emp.address=sc.next();
		
		System.out.println("Enter salary");
		emp.salary=sc.nextInt();
		
		emp.printDetail();
	}

}

class Member{

	String name;
	int age ;
    String phoneNumber;
	String address;
	double salary ;
	
	public void printSalary() {
		System.out.println(salary);
	}
}

class Employee extends Member{
	
//	super(name,age,phoneNumber,address,salary);
	String specialisation; 
	String department ;
	
	public void printDetail() {
		System.out.println("Name: "+super.name);
		System.out.println("Age: "+super.age);	
		System.out.println("PhoneNumber: "+super.phoneNumber);	
		System.out.println("Address: "+super.address);
		super.printSalary();
	}
}
class Manager extends Member {
	String specialisation; 
	String department ;
	public void printDetail() {
		System.out.println("Name: "+super.name);
		System.out.println("Age: "+super.age);	
		System.out.println("PhoneNumber: "+super.address);	
		System.out.println("Address: "+super.address);	
		super.printSalary();
	}
}
