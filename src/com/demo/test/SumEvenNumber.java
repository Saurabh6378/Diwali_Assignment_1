package com.demo.test;

import java.util.Scanner;

public class SumEvenNumber {
	
		public static void main(String [] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter a number");
			int num=sc.nextInt();
			int sum = num * (num + 1);
			System.out.println("Sum of first" + num + "Even number is:" + sum);
			
		}

	}



