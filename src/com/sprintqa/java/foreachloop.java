package com.sprintqa.java;

public class foreachloop {
	public static void main(String[] args) {
	int numbers[] []= {{10,20,30},{40,50,60},{70,80,90}};
	
	//60 150 240
		int sum=0;
	for(int i=0; i<numbers[][] ;i++) {
		
		for(int j=0; j<numbers[i].length; j++) {
			sum=sum+numbers[i][j];
		}
			
		
	System.out.println("Sum of row"+i+"="+sum); }	}
	
	}