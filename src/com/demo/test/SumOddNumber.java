package com.demo.test;

import java.util.Scanner;

public class SumOddNumber {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int sum=num * num;
		System.out.println("Sum of first" + num + "Odd number is:" + sum);
		
		
	}

}
