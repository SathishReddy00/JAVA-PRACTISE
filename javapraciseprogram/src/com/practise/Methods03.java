package com.practise;

import java.util.Scanner;

//03.WITH RETURN TYPE AND NO PARAMETERS

public class Methods03 {
Scanner scan = new Scanner(System.in);
	
	
	
public static void main(String args[]) {
	Methods03 m3  = new Methods03();
	double bs=m3.BasicSalary();
	
	
	double house = m3.HouseRentAllowance();
	
	
	double da=m3.DearnessAllowance();
	
	
	double sa=m3.SpecialAllowance();
	
	
	double oa=m3.OtherAllowance();
	System.out.println("-------------SALARY SLIP------------");
	System.out.println("   Earnings                    Amount");
	System.out.println("-------------------------------------");
	System.out.println("OTHER ALLOWANCE IS           : "+oa);
	System.out.println("BASIC SALARY IS              : " + bs);
	System.out.println("HOUSE RENT ALLOWANCE(HRA) IS : "+ house);
	System.out.println("DEARNESS ALLOWANCE(DA) IS    : " + da);
	System.out.println("SPECIAL ALLOWANCE IS         : "+ sa);
	System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
	
	System.out.println("TOTAL EARNING(A)             : "+(bs+house+da+sa+oa));
	System.out.println("====================================");
	double pf = m3.ProvidentFund();
	
	
	double pt = m3.ProfessionalTax();
	
	double it = m3.IncomeTax();
	
	double od =m3.OtherDeductions();
	System.out.println("   DEDUCTIONS                            AMOUNT");
	System.out.println("---------------------------------------------");
	System.out.println("THE DEDUCTION PROVIDENT FUND(PF) IS : " + pf);
	System.out.println("THE PROFESSIONAL TAX IS             : " + pt);
    System.out.println("THE INCOME TAX IS                   : "+ it);
	System.out.println("THE OTHER DEDUCTIONS ARE            : "+od);
	System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
	System.out.println("TOTAL DEDUCTION                     : " + (pf+pt+it+od));
	System.out.println("============================================"); 
	System.out.println("TOTAL NET SALARY                    : " +((bs+house+da+sa+oa)-(pf+pt+it+od)));
	
}
 double BasicSalary() {
	 System.out.println("ENTER BASIC SALARY : ");
	 double bs= scan.nextDouble();
	 return bs;
	 
 }
 double HouseRentAllowance() {
	 System.out.println("ENTER HOUSE RENT ALLOWANCE : ");
	 double hra= scan.nextDouble();
	 return hra;
 }
 double DearnessAllowance() {
	 System.out.println("ENTER DARENESS ALLOWANCE : ");
	 double da = scan.nextDouble();
	 return da;
 }
 double SpecialAllowance() {
	 System.out.println("ENTER SPECIAL ALLOWANCE : ");
	 double sa= scan.nextDouble();
	 return sa;
 }
 double OtherAllowance() {
	 System.out.println("ENTER OTHER ALLOWANCE : ");
	double oa= scan.nextDouble();
	return oa;
 }
 
 double ProvidentFund() {
	 System.out.println("ENTER PROVIDENT FUND : ");
	 double pf=scan.nextDouble();
	 return pf;
 }
 double ProfessionalTax() {
	 System.out.println("ENTER THE PROFESSIONAL TAX : ");
	 double pt = scan.nextDouble();
	 
	 return pt;
 }
 double IncomeTax() {
	 System.out.println("ENTER THE INCOME TAX : ");
	 double it= scan.nextDouble();
	 return it;
 }
 double OtherDeductions() {
	 System.out.println("ENTER OTHER DEDUCTIONS : ");
	 double od= scan.nextDouble();
	 return od;
 }



}

