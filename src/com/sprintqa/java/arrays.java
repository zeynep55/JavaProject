package com.sprintqa.java;

import java.util.Scanner;
public class arrays {
	public static void main (String[]args) {
	
	int salary[]=new int[5];
	
	Scanner sc=new Scanner(System.in);
	
	int sum=0;
	
	
	
	salary[0]=sc.nextInt();
	salary[1]=sc.nextInt();
	salary[2]=sc.nextInt();
	salary[3]=sc.nextInt();
	salary[4]=sc.nextInt();
	
	for(int i=0; i <salary.length; i++) {
		
		sum=sum+salary[i];}
	
	System.out.print("Cost to company:"+sum);}
	

	
	
	

	

	}
