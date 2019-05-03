package com.practice;

import java.util.ArrayList;

public class SumAndAverage {


	
	//program starts here
	public static void main(String[] args) {
		
		//calls function that sums with for loop
		sumFor();
		
		
		//calls function that sums with while loop
		sumWhile();
		
		
	}
	
	public static void sumFor() {
		int sum=0,numbers=0;
		for(int i=1;i<10;i++) {
			sum+=i;
			numbers++;
		}
		
		System.out.println("Sum using for loop 1-10 is "+sum);
		
		//Calling average finder passing total sum and numbers 
		System.out.println("Average number is "+averageFinder(sum,numbers));
	}
	
	public static void sumWhile() {
		int sum=1,numbers=0;
		while(numbers<10) {
			sum+=numbers;
			numbers++;
		}
		
		System.out.println("\nSum using While loop 1-10 is "+sum);
	 
	}
	
	
	public static int averageFinder(int sum,int numbers) {
		 
		
		return sum/numbers;
		
		
		 
	}
	
	
	 
	
	
	
	
	
	

}
