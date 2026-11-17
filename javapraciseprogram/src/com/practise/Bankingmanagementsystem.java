package com.practise;

import java.util.Scanner;

public class Bankingmanagementsystem {
	Scanner scan=new Scanner(System.in);
	void displayBankName() {
		System.out.println("------STATE BANK OF INDIA--------");
	}
	void customerDetails(String name,long accountno) {
		System.out.println("CUSTOMER NAME : "+ name);
		System.out.println("ACCOUNT NO    : "+ accountno); 
		
	}
	String getIFSCCode() {
		System.out.println("enter the ifsc code : ");
		String code=scan.nextLine();
		return code; 
	}
	double calculateInterest(double amount,double rate,int years){
		return amount*rate*years/100;
		
	}
	void displayAccountType() {
		System.out.println("ACCOUNT TYPE : SAVING ACCOUNT");
	}
	double deposit(double balance,double amount) {
		return balance+amount;
	}
	double getMinimumBalance() {
		
		return 1000;
	}
	void displayTransaction(String type,double amount) {
		System.out.println("TYPE : "+ type);
		System.out.println("AMOUNT "+ amount);
	}
	void displayBankTimings() {
		System.out.println("BANK TIMINGS : 9:30 am to 4:30 pm");
	}
	double calcualteRemainingBalance(double balance,double withdrawl) {
		return balance-withdrawl;
	}
	
	

	public static void main(String[] args) {
		Bankingmanagementsystem b=new Bankingmanagementsystem();
		b.displayBankName();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the name : ");
		String name=scan.nextLine();
		
		System.out.println("enter the account number : ");
		long accno=scan.nextLong();
		b.customerDetails(name, accno);
		
		String c=b.getIFSCCode();
		System.out.println("IFSC CODE : "+c);
		
		System.out.println("enter taken  amount : ");
		double amt=scan.nextDouble();
		
		System.out.println("enter the rate : ");
		double rate=scan.nextDouble();
		
		System.out.println("enter the years or months : ");
		int duration=scan.nextInt();
		
		double total=b.calculateInterest(amt,rate,duration);
		System.out.println("EUDCATION LOAN INTEREST : "+total);
		
		b.displayAccountType();
		
		System.out.println("Enter the total balance : ");
		double bal=scan.nextDouble();
		
		System.out.println("Enter deposit amount : ");
		double amount=scan.nextDouble();
		
		double Totalbal=b.deposit(bal, amount);
		System.out.println("TOTAL AVILABLE BALANCE : "+Totalbal);
		
		double min=b.getMinimumBalance();
		System.out.println("MINIMUM BALACNE : "+min);
		
		System.out.println("Enter mode of transction : ");
		String trans=scan.next();
		
		System.out.println("enter transction amount : ");
		double ta=scan.nextDouble();
		
		b.displayTransaction(trans, amount);
		b.displayBankTimings();
		
		System.out.println("Enter the total balance :");
		double tb=scan.nextDouble();
		
		System.out.println("enter the withdraw amount : ");
		double wa=scan.nextDouble();
		
		double wamont=b.calcualteRemainingBalance(bal, wa);
		System.out.println("Total remaining balance : "+ wamont);
		System.out.println("-----------------------------------");
		}

}
