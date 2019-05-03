package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Outliersdentifier {
	static ArrayList<Double> radianValuesWithOutlier,outliers;
	static double valueMinusMean;
	public static void main(String[] args) {
		radianValuesWithOutlier=  new ArrayList<Double>();
		
		try {
			File file = new File("filename.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			 
			while ((line = bufferedReader.readLine()) != null) {
				Double doubleObject = new Double(line);
				radianValuesWithOutlier.add(doubleObject);
				outliersFinder(doubleObject);
			}
			
			 
			 

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
  
	public static void outliersFinder(double a) {
		outliers=  new ArrayList<Double>();
		
		
		double lowerOutlierBoundry,upperOutlierBoundry;
		
		lowerOutlierBoundry=doubleMeanFinder(radianValuesWithOutlier)-3*(sdFinder());
		
		upperOutlierBoundry=doubleMeanFinder(radianValuesWithOutlier)+3*(sdFinder());
		
		//first gotta find the mean
		
	//	System.out.println( "the mean value of doubles is : "+doubleMeanFinder(radianValuesWithOutlier));
		
		//one of the way could be substracting the average number from every value and none of the result 
		//should be greater than 3 , if anything is greater than 3 it is outlier.
		 
		 
		 
		
		//System.out.println("standard deviation is : "+sdFinder(sum,number));
		
		for(int a1=0;a1<radianValuesWithOutlier.size();a1++) {
			if(radianValuesWithOutlier.get(a1)<lowerOutlierBoundry || radianValuesWithOutlier.get(a1)>upperOutlierBoundry) {
				outliers.add(radianValuesWithOutlier.get(a1));
			}
		
		}
		
		
		System.out.println("Outliers are : "+outliers.toString());
	}
	

//Mean of the whole file is determined here
public static double doubleMeanFinder(ArrayList<Double> array) {
		 
	double sum=0,numbers=0;
	for(int i=0;i<array.size();i++) {
		sum+=array.get(i);
		numbers++;
	}
	//System.out.println("Sum  number is "+sum);
	
	//System.out.println("numbers: "+numbers);
	
		return sum/numbers;
		
		
		 
	}


//standard deviation of the whole file is determined here
public static double sdFinder() {

	 double sum = 0;
	 int numbers = 0;
	 
	 double mean=doubleMeanFinder(radianValuesWithOutlier);
	//System.out.println(mean);
	 
	 //substracting mean from every scores
	for(int a1=0;a1<radianValuesWithOutlier.size();a1++) {
		valueMinusMean=Math.pow(radianValuesWithOutlier.get(a1)-mean , 2); 
		
		sum+=valueMinusMean;
		numbers++;
	}
	
	 //gives the standard deviation
		return Math.pow(sum/numbers, .5);
		
		
		 
	}

}
