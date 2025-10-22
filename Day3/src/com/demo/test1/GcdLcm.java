package com.demo.test1;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter a Second number:");
		int b=sc.nextInt();
		
		int gcd=findGCD(a,b);
		int lcm=(a*b)/gcd;
		
		System.out.println("GCD of" +a+"and"+b+"is:"+gcd);
		System.out.println("Lcm of" +a+"and"+b+"is:"+lcm);
	}

	private static int findGCD(int x, int y) {
		while (y!=0) {
			int temp = y;
			y = x%y;
			x=temp;
		}
		return x;
	}

}
