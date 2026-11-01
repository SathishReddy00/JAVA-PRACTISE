package com.practise;


public class Methods {
	void display() {
		System.out.println("Hello Java");
		
	}
	void welcome() {
		System.out.println("Welcome to Java Programming");
	}
	void showNumber() {
		System.out.println("100");
	}
	void shownum() {
		int a=10;
		int b=20;
		System.out.println("SUM OF TWO NUMBERS IS : "+ (a+b));
	}
	void showDifference() {
		int num1=50;
		int num2=20;
		System.out.println("THE DIFFERENCE BETWEEN 50 AND 20 IS : "+( 50-20));
	}
	void showProduct() {
		int a=5;
		int b=6;
		System.out.println("The product of 5 and 6 is : "+ 5*6);
	}
	void showDivision() {
		int num1=100;
		int num2=5;
		System.out.println("The result of 100 divided by 5 is : "+ 100/5);
	}
	void showRemainder() {
		int a=17;
		int b=5;
		System.out.println("The remainder of 17 is divided by 5 is : "+ 17%5);
	}
	void printname() {
		System.out.println("Developer name is : sathish reddy");
	}
	void printCollege() {
		String college=" UNITED INSTITUTE OF TECHNOLOGY";
		System.out.println("COLLEGE NAME IS : "+ college);
	}
	void showAge() {
		int a=23;
		System.out.println("AGE IS : "+ a);
	}
	void showSquare() {
		int a=9;
		int square=a*a;
		System.out.println("The square of 8 is : "+ square);
	}
	void showCube() {
		int b=4;
		int cube=b*b*b;
		System.out.println("The cube of 3 is : "+ cube);
	}
	void printStars() {
		String c="*****";
		System.out.println("The five asterrisks = "+c);
	}
	void displayMessage() {
		System.out.println("Welcome to vcube");
		System.out.println("welcome to java");
		System.out.println("Welcome to hyderbad");
		}
	void calculate() {
		int number1=33;
		int number2=44;
		System.out.println("THE SUM OF NUM1 AND NUM2 :"+ (number1+number2));
		}
	void showValues() {
		int x=1;
		int y=2;
		int z=3;
		System.out.println("The value of x : " + x);
		System.out.println("The value of y : "+ y);
		System.out.println("The value of z : "+z);
	}
	void swapValues() {
		int  p=3;
		int q=4;
		System.out.println("Value of p before swap : "+p );
		System.out.println("Value of q before swap : "+q);

		p=p+q;
		q=p-q; 
		p=p-q;  
		System.out.println("Value of p after swap : "+p);
		System.out.println("Value of q after swap : "+q);
		}
	void showAverage() {
		int a=10;
		int b=20;
		int c=30;
		System.out.println("The Average of Three numbers : "+(a+b+c/3));
		
	}
	void calculateArea() {
		int length=10;
		int width=10;
		int area=length*width;
		System.out.println("Area of rectangle : "+ area);
	}
	void calculatePerimeter() {
		int len=30;
		int wid=10;
		int perimeter=2*(len+wid);
		System.out.println("The perimeter of rectangle : "+ perimeter);
	}
	void calculateCicleArea() {
		double radius=12.5;
		double area=3.14*radius*radius;
		System.out.println("Area of circle : "+ area);
	}
	void convertTemperature() {
		double temp=37;
		double converter=temp*9/5+32;
		System.out.println("the fahrenheit of celsius : "+converter);
		
	}
	void showSimpleInterest() {
		float p=35000;
		float t=2.5f;
		float r=1.7f;
		float ptr=(p*t*r)/100;
		System.out.println("The simple interest : "+ ptr);
		}
	void showTotalMarks() {
		int maths=89;
		int science=84;
		int social=75;
		int telegu=90;
		int english=78;
		int total=maths+science+social+telegu+english;
		System.out.println("The total marks of subjects : "+ total);
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Methods m=new Methods();
		m.display();
		m.welcome();
		m.showNumber();
		m.shownum();
		m.showDifference();
		m.showProduct();
		m.showDivision();
		m.showRemainder();
		m.printname();
		m.printCollege();
		m.showAge();
		m.showSquare();
		m.showCube();
		m.printStars();
		m.displayMessage();
		System.out.println("-------------------------------");
		m.calculate();
		m.showValues();
		m.swapValues();
		m.showAverage();
		m.calculateArea();
		m.calculatePerimeter();
		m.calculateCicleArea();
		m.convertTemperature();
		m.showSimpleInterest();
		m.showTotalMarks();
		System.out.println("---------------------------------");
	
		System.out.println("main method ended");
		
		
		
	}
	 

}
