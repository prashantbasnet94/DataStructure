import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class ManipulateTree {
	static Tree tree ;
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//importing from file
		//System.out.println("Name of the file you have data :  ?");
		//String fileName=sc.nextLine();
		try {
			
			
			//File file = new File(fileName+".txt");
			File file = new File("nums.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			 int firstTime=0;
			while ((line = bufferedReader.readLine()) != null) {
				int value = Integer.parseInt(line);
				if(firstTime==0) {
					tree = new Tree(value);
					firstTime++;
				}else {
					System.out.println(line);
					tree.insert(value);
				}
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------");
		tree.DepthFirstSearchInOrder();
		tree.DepthFirstSearchInOrderReverse();
	

	}

}
