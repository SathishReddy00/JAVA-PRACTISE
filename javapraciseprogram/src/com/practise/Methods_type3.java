package com.practise;

import java.util.Scanner;

public class Methods_type3 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Methods_type3 obj = new Methods_type3();
		System.out.println(obj.phone());

	}

	public int phone() {
		System.out.println("enter phone prize");
		int prize = 0;
		prize = sc.nextInt();
		System.out.println("enter quantity");
		int qty = sc.nextInt();
		int tot = prize * qty;
		return tot;

	}

}
