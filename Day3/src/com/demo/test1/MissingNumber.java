package com.demo.test1;

public class MissingNumber {
	public static void main(String [] args) {
	
	int [] arr= {2,4,5};
	int n=arr.length;
	      
	int total=n*(n+1)/2;
	int sum = 0;      
	            

	for(int num:arr) {
		sum+=num;
	}
	int missing=total-sum;
	System.out.println("The missing number is:"+missing);
}
	

}
