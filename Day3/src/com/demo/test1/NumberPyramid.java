package com.demo.test1;

import java.util.Scanner;

public class NumberPyramid {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number of Rows");
		int rows=sc.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print(k + " ");
				
			}
			System.out.println();
		}
		
	}

}
