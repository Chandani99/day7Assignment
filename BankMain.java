package com.day7;

import java.util.Scanner;

public class BankMain {
	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("axis")) {
			Axis ax=new Axis("Axis", "89898dghf", 7);
			return ax;
		}else if(bank.equalsIgnoreCase("icici")) {
			ICICI ic=new ICICI("ICICI", "6756ffgvv", 5);
			return  ic;
		}
		else {
		   return null;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bank Name: ");
		String bankName=sc.next();
		
		System.out.println(getBank(bankName));
		
			Bank ax2=getBank(bankName);
			ax2.displayDetails();
			Axis ax1=(Axis)getBank(bankName);
			ax1.getCreditCard();
		
			Bank ic2= getBank(bankName);
			ic2.displayDetails();
	}

}
class Bank{
	String branchName; 
	String ifscCode; 
	Bank(String branchName2, String ifscCode2){
		this.branchName=branchName2;
		this.ifscCode=ifscCode2;
	}

	void displayDetails() {
		System.out.println("Branch Name: "+branchName);
		System.out.println("IFSC Code: "+ifscCode);
	}
}
class ICICI extends Bank{
	double rateOfInterest;
	ICICI(String branchName2, String ifscCode2,double rateOfInterest2) {
		super(branchName2, ifscCode2);
		this.rateOfInterest=rateOfInterest2;
		// TODO Auto-generated constructor stub
	}

	
	
	void displayDetails() {
		System.out.println("Branch Name: "+branchName);
		System.out.println("IFSC Code: "+ifscCode);
		System.out.println("Rate of Interest: "+rateOfInterest);
	}

}
class Axis extends Bank{
	double rateOfInterest; 
	Axis(String branchName2, String ifscCode2,double rateOfInterest2) {
		super(branchName2, ifscCode2);
		this.rateOfInterest=rateOfInterest2;
	}
	
	void displayDetails() {
		System.out.println("Branch Name: "+branchName);
		System.out.println("IFSC Code: "+ifscCode);
		System.out.println("Rate of Interest: "+rateOfInterest);
	}
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
		
	}
}


