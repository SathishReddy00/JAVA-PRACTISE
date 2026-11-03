package com.practise;
//no return type and with parameters;

public class Methodtype02 {
	void addition(int a,int b) {
		System.out.println("ADDITION OF a AND b IS :  " + (a+b));
		
	}
	void subtraction(int x,int y) {
		System.out.println("SUBTRACTION OF x AND y IS : "+ (x-y));
	}
	void multiplication(int p,int q) {
		System.out.println("MULITIPLICATION OF p AND q IS : "+ p*q);
	}
	void division(int a,int b) {
		System.out.println("DIVISION OF a AND b IS : "+ a/b);
	}
	void modulus(int x,int y) {
		System.out.println("MODULUS OF x and Y IS : "+ x%y);
	}

	public static void main(String[] args) {
		Methodtype02 m2=new Methodtype02();
		m2.addition(2, 3);
		m2.subtraction(5,4);
		m2.multiplication(4, 5);
		m2.division(50,10);
		m2.modulus(29 , 3);     //methods are called by values;

	}

}
