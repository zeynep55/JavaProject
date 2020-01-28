package com.sprintqa.java;

public class whileloop {
	
	public static void main(String [] args) {
		 
		
		int num1=372;
	    int sum=0;
		int lastDigit;
		
		while (num1!=0) { 
			
		lastDigit=num1%10;
		num1=num1/10;
		sum=sum+lastDigit;}
				
				System.out.println(sum);
		}
		
		
	}		
	






