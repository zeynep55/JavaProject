package com.sprintqa.java;

import java.util.Scanner;

public class primenumber {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1= sc.nextInt() ;
		boolean flag=false;
	
		
		for (int i=2; i<=num1-1; i++)
		{if(num1==2){
			break;}
			
		{if (num1 % i==0) {
		
		System.out.print("Not prime");
		flag=true;
		break;
		}
		}
		if (flag==false) {
			
	
			System.out.println("Number is prime");

		
		}	
	
	}		
	}


	
	
}
	
	
	
	
	
	
	
	
	


