package com.day7;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("DayScholor Student info");
		System.out.println("Enter Student Id");
		int sId=sc.nextInt();
		
		System.out.println("Enter Student Name");
		String sName=sc.next();
		
		System.out.println("Enter exam fee");
		double sExamFee=sc.nextDouble();
		
		System.out.println("Enter transport fee");
		double transportFee=sc.nextDouble();
		
		DayScholar ds=new DayScholar(sId,sName,sExamFee,transportFee);
		ds.displayDetails();
		
		System.out.println("Enter Amount fee to be pay");
		double amount=sc.nextDouble();
		
		System.out.println("Remaing fee: "+ds.payFee(amount));
		
		// TODO Auto-generated method stub
		System.out.println("************************Hostler Student info*****************************");
		System.out.println("Enter Student Id");
		int sId1=sc.nextInt();
		
		System.out.println("Enter Student Name");
		String sName1=sc.next();
		
		System.out.println("Enter exam fee");
		double sExamFee1=sc.nextDouble();
		
		System.out.println("Enter transport fee");
		double transportFee1=sc.nextDouble();
		
		Hostlar ho=new Hostlar(sId1,sName1,sExamFee1,transportFee1);
		ho.displayDetails();
		
		System.out.println("Enter Amount fee to be pay");
		double amount1=sc.nextDouble();
		
		System.out.println("Remaing fee: "+ds.payFee(amount1));

	}

}

class Student{
	int studId ; 
	String studName ;
	double examFee;	
	public Student(int studId2,String studName2,double examFee2) {
		this.studId=studId2;
		this.studName=studName2;
		this.examFee=examFee2;
	}
	public void displayDetails() {
		System.out.println("Name: "+studId);
		System.out.println("Age: "+studName);	
		System.out.println("exam fee: "+examFee);	
		
	}
	public double payFee(double amountPaid){
		double remainingFee=examFee-amountPaid;
		return remainingFee;
	}
}

class DayScholar extends Student {
	double transportFee;
    public 	DayScholar(int studId2,String studName2,double examFee2,double transportFee2) {
    	super(studId2,studName2,examFee2);
    	this.transportFee=transportFee2;
    }
	
 }
    

class Hostlar extends Student{
    double hostelFee;
	public Hostlar(int studId2, String studName2, double examFee2,double hostelFee2) {
		super(studId2, studName2, examFee2);
		this.hostelFee=hostelFee2;
		// TODO Auto-generated constructor stub
	}	
	
}
