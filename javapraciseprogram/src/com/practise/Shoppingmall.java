package com.practise;

import java.util.Scanner;

public class Shoppingmall {
	Scanner scan=new Scanner(System.in);
	void welcome(){
		System.out.println("WELCOME TO KLM SHOPPING MALL");
	}
	void showOffers() {
		System.out.println("Today's Offer   : 10% Discount");
	}

	void customerDetails(){
		String name ="Sathish";
		String membership="Gold";
		System.out.println("Customer Name   : "+name);
		System.out.println("Memebership     : "+membership);
	}
	void productDetails(String product,double price) {
		System.out.println("Product         : "+product); 
		System.out.println("Price           : "+price);
		
	}
	void calculateBill(double amount,int quantity){
		double total=amount*quantity;
		System.out.println("Total Bill      : "+ total);
	
		
	}
	void applyDiscount(double amount,double discount) {
		double finalAmount=amount-discount;
		System.out.println("After Discount  : "+finalAmount);
		
		
	}
	double getDeliveryCharge() {
		double charge=50;
		return charge;
		
	}
	 int getShoppingPoints() {
		 int points=100;
		 return points;
	 }
	 double calculateGST(double amount) {
		double gst=amount*0.18;
		return gst;
	 }
	double  calculateFinalBill(double amount,double discount) {
		double finalBill=amount-discount;
		return finalBill;
	
	
		
	}
	
	


	public static void main(String[] args) {
		
		
		Shoppingmall sm=new Shoppingmall();
		
		sm.welcome();
		System.out.println("***************************");
		sm.showOffers();
		sm.customerDetails();
		System.out.println("--------------------------");
		
		sm.productDetails("laptop",50000); 
		sm.calculateBill(50000,1);
		sm.applyDiscount(50000,5000);
		System.out.println("-------------------------");
		double del=sm.getDeliveryCharge();
		int shop=sm.getShoppingPoints();
		System.out.println("Delivary charge : "+del); 
		System.out.println("Shopping Points : "+shop);
		System.out.println("-------------------------");
		double gst=sm.calculateGST(45000);
		double finalbill=sm.calculateFinalBill(45000,5000);
		System.out.println("GST Amount      : "+gst);
		System.out.println("Final Bill      : "+finalbill);

	}

}
