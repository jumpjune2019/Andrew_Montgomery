package phone_app;
import java.util.Scanner;
import java.io.*;

public class MyPhone {

	public static void main(String[] args) {
		
//		Using Scanner for Getting Input from User
		Scanner in = new Scanner(System.in);
		
		String Input;
		FileWriter fout = null;
		String  Phonebook[][] = new String[3][5];
		boolean keepChugging = true;
		
		try {
			
			fout = new FileWriter("C:\\java_training\\assignments\\java_002\\src\\phone_app\\Phone.txt");
		
		for (int i = 0; i < 5; i++) {

			  System.out.println("Enter in your Name");
		  
			  while (keepChugging) {
				  
				  try {
					  	Phonebook[0][i] = in.nextLine();
					  	keepChugging = false;
						  if(Phonebook[0][i].equalsIgnoreCase("")) {
							  throw new MyException();
						  }

					  
				  } catch(MyException e) {
					  System.out.println("Error: Please enter a name.");
					  keepChugging = true;
				  }
			  }
			  
			  
			  
			  keepChugging = true;
			  
			  System.out.println("Enter in your Phone Number");
			  
			  while (keepChugging) {
				  
				  try {
					  Phonebook[1][i] = in.nextLine();
					  keepChugging = false;
					  if(Phonebook[1][i].equalsIgnoreCase("")) {
						  throw new MyException();
					  }
					  
					  
				  } catch(MyException e) {
					  System.out.println("Error: Please enter a Phone Number.");
					  keepChugging = true;
				  }
				  
			  }
			  
			  keepChugging = true;
			  
			  System.out.println("Enter in your City");
//			  
			  while (keepChugging) {
				  
				  try {
					  Phonebook[2][i] = in.nextLine();
					  keepChugging = false;
					  if(Phonebook[2][i].equalsIgnoreCase("")) {
						  throw new MyException();
					  }
				  } catch(MyException e) {
					  System.out.println("Error: Please enter a City.");
					  keepChugging = true;
				  }
			  }
			  
			  System.out.println("Is the above information correct? Press any key if correct. If the information is incorrect press (R or r) to restart");
			  
			  Input = in.nextLine();
			  
			  if(Input.equalsIgnoreCase("R")) {
				  i--;
			  }
			  
			  keepChugging = true;
			}
		printToScreen(Phonebook);
		printToFile(fout,Phonebook);
		
		} catch (Exception e) {
			System.out.println("Error");
		}
		
//		for (int i = 0; i < 5; i++) {
//			System.out.format("%20s ",Phonebook[0][i]);
//			System.out.format("%20s ",Phonebook[1][i]);
//			System.out.format("%20s ",Phonebook[2][i]);
//			
//			System.out.println();
//			}
		
	}
	
	public static void printToScreen(String[][] myArr) {

		System.out.format("%-20s", "Name");
		System.out.format("%-20s", "Phone");
		System.out.format("%-20s", "City");
		System.out.println();
		
		for(int i=0; i < 5; i++) {
			
			System.out.format("%-20s", myArr[0][i]);
			System.out.format("%-20s", myArr[1][i]);
			System.out.format("%-20s", myArr[2][i]);
			System.out.println();
			
		}
		
	}
	
	public static void printToFile(FileWriter fw, String[][] myArr) throws IOException {
		
		fw.write(String.format("%-20s", "Name"));
		fw.write(String.format("%-20s", "Name"));
		fw.write(String.format("%-20s", "Name"));
		
		fw.write("\n");
		
		for(int i = 0; i < 5; i++) {
			
			fw.write(String.format("%-20s", myArr[0][i]));			
			fw.write(String.format("%-20s", myArr[1][i]));			
			fw.write(String.format("%-20s", myArr[2][i]));
			
			fw.write("\n");
			
		}
		
		fw.flush();
		fw.close();
		
	}
}

