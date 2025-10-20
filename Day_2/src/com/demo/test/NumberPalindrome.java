package com.demo.test;

import java.util.Scanner;

public class NumberPalindrome {
	
	public static void main(String [] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		 while (true) {
	            System.out.print("Enter a number: ");
	            num = sc.nextInt();

	            
	            if (num == 0) {
	                System.out.println("Exiting...");
	                break;
	            }
		
		int originalNum = num;
		int reversedNum=0;
		
		
		while(num !=0) {
			int digit = num%10;
			reversedNum=reversedNum*10+digit;
			num=num/10;
		}
		
		if(originalNum==reversedNum) {
			System.out.println("is a palindrome");
			
		}else {
			System.out.println("Not a Palindrome");
			
		}
	}
	

}
}
