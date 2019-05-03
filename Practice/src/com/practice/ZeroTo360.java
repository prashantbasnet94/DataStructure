package com.practice;
 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZeroTo360 {
	static PrintWriter writer  ;
	
	
	public static void main(String[] args) throws FileNotFoundException   {
	
		 //will ask user to input the times they want to go futher
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Make the increment an input to your program by: ");
		int increment=sc.nextInt();
		
		System.out.println("Make the times an input to your program by: ");
		int times=sc.nextInt();
		
		//passes the input to the number generator where numbers are generated
		threeSixtyenerator(increment,times);
		
		
	}

	public static void threeSixtyenerator(int increment,int times) throws FileNotFoundException   {
		
		
		 
		 writer = new PrintWriter("DataFile.txt");
		
		
		
		//here j is used because the program wont stop if you do i=0 , this will lead your function for infinite loop
		int j=0,k=0;
		
		//number is counted from 0 to 360
		for(int i=0;i<times;i++) {
			
			
			while(j<=360) {
				//once it reaches 360 it will then set 360 to 0
				if(k%360==0) {
					k=0;
					
					 
				}
			//	System.out.println(j);
				
				
				//writing all the radian that is return from parametarizing 
				//degree value into sinFunction and getting radian from there,wrting into a file
				
				
				System.out.println(k);
				try  {
				    writer.println(sinFunction(k));
				}catch(Exception e){
					e.printStackTrace();
				}
				
				//System.out.println(sinFunction(j)); returns radians in console
				j+=increment;
				k=j;
			}
			
			
		 
		}
		
		//should always close the value
		 writer.close();
		 
	}
	
	
	
	///sinfunction will return any degree value inserted into radian value
			public static double sinFunction(int j) {
			//	double radian = 
				return Math.sin(Math.toRadians(j));
			}
}
