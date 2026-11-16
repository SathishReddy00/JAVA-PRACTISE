package com.practise;

import java.util.Scanner;

 
public class Methodtypefour {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("****************************");
		System.out.println("Enter a Subject 1 marks : ");
		int sub1=scan.nextInt();
		
		System.out.println("Enter a Subject 2 marks  : ");
		int sub2=scan.nextInt();
		
		System.out.println("Enter a Subject 3 marks  : ");
		int sub3=scan.nextInt();	
		
		int total=calculateTotal(sub1,sub2,sub3);
		
		System.out.println("TOTAL MARKS OF THE STUDENT IS : "+ total);
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter the Basic salary : ");
		double bs=scan.nextDouble();
		
		System.out.println("Enter the HRA : ");
		double hra=scan.nextDouble();
		
		System.out.println("Enter the DA : ");
		double da=scan.nextDouble();
		
		double salary =calculateSalary(bs,hra,da);
		System.out.println("TOTAL SALARY OF EMPLOYEE IS :"+salary);
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter the price of the product : ");
		double price=scan.nextDouble();
		
		System.out.println("Enter the quantity : ");
		double qty=scan.nextDouble();
		
		double bill=calcualteBill(price,qty);
		System.out.println("TOTAL AMOUNT OF THE BILL : "+bill);
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter the principal of amount : ");
		double amt=scan.nextDouble();
		
		System.out.println("Enter the rate of interest  : ");
		double intre=scan.nextDouble();
		
		System.out.println("Enter the time period : ");
		int duration=scan.nextInt();
		
		double si= calculateInterest(amt,intre,duration);
		System.out.println("TOTAL SIMPLE INTEREST OF VALUES : "+si);
		System.out.println("-----------------------------------------");
		
		System.out.println("enter the total units : ");
		int units=scan.nextInt();
		
		System.out.println("enter the price per unit : ");
		double cost=scan.nextDouble();
		
		double totalbill=calculateBill(units,cost);
		System.out.println("TOTAL COST OF ELECTRICITY : "+ totalbill);
		System.out.println("-----------------------------------------");
		
		System.out.println("enter price of the food : ");
		double p=scan.nextDouble();
		
		System.out.println("enter the quantity : ");
		double q=scan.nextDouble();
		
		System.out.println("enter the delivery charges : ");
		double dc=scan.nextDouble();
		
		double totalcost= calculateOrder(p,q,dc);
		System.out.println("TOTAL COST OF THE FOOD IS  : "+totalcost);
		System.out.println("-----------------------------------------");
		
		System.out.println("enter total balance : ");
		double bal=scan.nextDouble();
		
		System.out.println("enter the withdraw amount : ");
		double wamt=scan.nextDouble();
		
		double balance=withdraw(bal,wamt);
		System.out.println("Remaining balance : "+balance);
		System.out.println("-----------------------------------------");
		
		System.out.println("enter the total planamount : ");
		int plan=scan.nextInt();
		
		System.out.println("enter discount : ");
		int dis=scan.nextInt();
		
		int finalrecharge=recharge(plan,dis);
		System.out.println("Total final recharge of your recharge : "+finalrecharge);
		System.out.println("-----------------------------------------");
		
		System.out.println("enter the consultation fee : ");
		int fee=scan.nextInt();
		
		System.out.println("enter the medicine cost : ");
		int medicine=scan.nextInt();
		
		System.out.println("enter room charge : ");
		int room=scan.nextInt();
		
		int hospitalbill=calculateHospitalBill(fee,medicine,room);
		System.out.println("TOTAL HOSPITAL BILL : "+ hospitalbill);
		System.out.println("-----------------------------------------");
		
		System.out.println("enter total number of rental days : ");
		int days=scan.nextInt();
		
		System.out.println("enter the cost per day : ");
		int costperday=scan.nextInt();
		
		int totalrent=calculateRent(days,costperday );
		System.out.println("TOTAL RENT : "+totalrent);
		System.out.println("***************************************");
		
	
	}
	static int calculateTotal(int sub1,int sub2,int sub3) {
		return sub1+sub2+sub3;  
	}
	static double calculateSalary(double sal,double hra,double da) {
		double tot=sal+hra+da;
		return tot;
	}
	static double calcualteBill(double  price,double quantity) {
		return price*quantity;
	}
	static double calculateInterest(double amount,double interest,int time) {
		return amount*interest*time/100;
	}
	static double calculateBill(int units,double price) {
		return units*price;
	}
	static double calculateOrder(double price,double quantity,double deliverycharges) {
		return price*quantity+deliverycharges;
	}
	static double withdraw(double balance,double wamount) {
		return balance-wamount;
	}
	static int recharge(int plan,int discount) {
		return plan-discount;
	}
	static int calculateHospitalBill(int consultationfee,int medicinecost,int roomcharges) {
		return consultationfee+medicinecost+roomcharges; 
	}
	static int calculateRent(int days,int rentperday) {
		return days*rentperday; 
	}
	

}
