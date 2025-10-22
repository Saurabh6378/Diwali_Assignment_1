package com.demo.test1;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		
		System.out.println("Multiplication table of"+num+":");
		for(int i=0; i<num; i++) {
			System.out.println(num+"x"+i+" = "+(num*i));
		}
	}

}
