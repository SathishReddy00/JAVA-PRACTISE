package com.practise;

import java.util.Scanner;

//with return type and with parameters
public class Methods04 {
	
	
	static double areaOfTriangle(double length,double height) {
		return 0.5*length*height;
	}
	
	static double areaOfCircle(double radius) {
		return Math.PI*radius*radius;
		
	}
	static double areaOfRectangle(double length,double breadth) {
		return length*breadth;
	}
	static double areaOfSquare(double side) {
		return side*side;
	}
	static double areaOfEllipse(int a,int b) {
		return Math.PI*a*b;
	}
	



	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ENTER THE LENGTH : ");
		double len=scan.nextDouble();
		System.out.println("ENTER THE HEIGHT : ");
		double hei=scan.nextDouble();
		double totalarea=areaOfTriangle(len,hei); 
		System.out.println("AREA OF TRIANGLE : "+totalarea);
		
		System.out.println("ENTER THE RADIUS : ");
		double rad=scan.nextDouble();
		double areaC= areaOfCircle(rad);
		System.out.println("AREA OF CIRCLE : "+areaC);
		
		
		System.out.println("ENTER LENGTH : ");
		double leng=scan.nextDouble();
		System.out.println("ENTER BREADTH : ");
		double bred=scan.nextDouble();
		double areaR=areaOfRectangle(leng,bred);
		System.out.println("AREA OF RECTANGLE IS : "+areaR);
		
		System.out.println("ENTER SIDE VALUE : ");
		double side=scan.nextDouble();
		double area=areaOfSquare(side);
		System.out.println("AREA OF SQUARE : "+area);
		
		System.out.println("ENTER VALUE OF a : ");
		int value1=scan.nextInt();
		System.out.println("ENTER VALUE OF b : ");
		int value2=scan.nextInt();
		double areaE=areaOfEllipse(value1,value2);
		System.out.println("AREA OF ELLIPSE : "+areaE);
		
		
		
		
		

	}

}
