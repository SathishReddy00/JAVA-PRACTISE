package com.practise;

import java.util.Scanner;

//no return type and with parameters;

public class Methodtype002 {
	void addition(int a,int b) {
		System.out.println("THE SUM OF TWO NUMBERS IS : "+ (a+b));
	}
	void subtraction(float x,float y) {
		System.out.println("THE SUM OF TWO NUMBERS IS : "+(x-y));
	}
	void multiplication(double f, double g) {
		System.out.println("THE PRODUCT OF TWO NUMBERS IS : "+(f*g));
	}
	void division(double a,double b) {
		System.out.println("THE DIVISION OF TWO NUMBERS IS : "+(a/b));
	}
	void modulus(int x,int y) {
		System.out.println("THE REMAINDER OF TWO NUMBERS IS :"+(x%y));
	}

	public static void main(String[] args) {
		Methodtype002 m2=new Methodtype002();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter value of a for addition : ");
		int inputvalue=scan.nextInt();
		System.out.println("enter value of b for addition: ");
		int input2=scan.nextInt();
		m2.addition(inputvalue, input2);
		
		System.out.println("enter value of x for subtraction: ");
		float input3=scan.nextFloat();
		System.out.println("enter value of y for subtraction : ");   
		float input4=scan.nextFloat();
		m2.subtraction(input3, input4);
		
		System.out.println("enter value1 to mul : ");
		double input5 = scan.nextDouble();
		System.out.println("enter value2 to mul : ");
		double input6 = scan.nextDouble();
		m2.multiplication(input5, input6);
		
		System.out.println("enter a num1 to div : ");
		int input7=scan.nextInt();
		System.out.println("enter a num2 to div : ");
		int input8=scan.nextInt();
		m2.division(input7,input8);
		
		System.out.println("enter a num1 for modulus : ");
		int input9=scan.nextInt();
		System.out.println("enter a num2 for modulus : ");
		int input10=scan.nextInt();
		m2.modulus(input9, input10);
		
		
		
		
		

	}

}
