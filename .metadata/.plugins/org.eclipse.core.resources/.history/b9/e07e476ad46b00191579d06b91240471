package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ManipulateLinkedList {
	static LinkedList list ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//importing from file
		System.out.println("Name of the file you have data :  ?");
		String fileName=sc.nextLine();
		try {
			
			
			//File file = new File(fileName+".txt");
			File file = new File("numbers.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			 int firstValue=0;
			while ((line = bufferedReader.readLine()) != null) {
				if(firstValue==0) {
					list= new LinkedList(0);
				}
				firstValue++;
				int value = Integer.parseInt(line);
				//System.out.println(value);
				list.append(value);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		ask(sc,list);
		 
	}
	public static void ask(Scanner sc,LinkedList list) {

		//for second question requirement
		System.out.println(" 1: List to display");
		System.out.println(" 2: Request the length");
		System.out.println(" 3: Delete any value");
		System.out.println(" 3: Number of Duplicates value");
		
		int number = sc.nextInt();
		 loop(number,sc,list);
		
	}
	
	public  static  void loop(int number,Scanner sc,LinkedList list) {
		switch(number) {
		case 1:System.out.println(list.toString(LinkedList.length ));
		ask(sc,list);
		break;
		case 2:System.out.println(LinkedList.length);
		ask(sc,list);
		break;
		case 3:
			System.out.println("Enter the number you want to delete: ?");
			int a=sc.nextInt();
			list.delete(a);
			ask(sc,list);
		break;
		case 4:
			System.out.println(LinkedList.NumberOfDuplicate());
			ask(sc,list);
		break;
		}
	}

}
