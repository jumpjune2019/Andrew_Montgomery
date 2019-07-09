package phone;


import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phoneBook();
	}
public static String[][] phoneBook() {
	String [][] phoneBook= new String[6][3];
	Scanner input = new Scanner(System.in);
	String inputString ="";
	
	
	phoneBook[0][0]="Name";
	phoneBook[0][1]="Phone Number";
	phoneBook[0][2]="City";
	 for (int row = 1; row < phoneBook.length; row++) { 
	        for (int col = 0; col < phoneBook[row].length; col++) {
	            if(col==0){
	                System.out.println("Enter name: ");
	            	inputString = input.nextLine();
	            	phoneBook[row][0]=inputString;
	            }else if(col==1){
	                System.out.println("Enter phone number: ");
		            inputString = input.nextLine();
		            phoneBook[row][1]=inputString;
	            }else if(col==2){
	               	System.out.println("Enter city: ");
	            	inputString = input.nextLine();
		            phoneBook[row][2]=inputString;
	            }
	            //board[row][col] = row * col; }

		}
	 }
	try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
		for (String[] row : phoneBook) {
            for (String elem : row) {
                System.out.format("%-15s ", elem );
            }
            System.out.println();
		}
		
		} catch (IOException exc) {
		System.out.println("Write Error.");
		}
	//************************************************************
	//save to file
	try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
		//create file
				FileWriter fw = new FileWriter("phone.txt");
				BufferedWriter out= new BufferedWriter(fw);
				
				

				for (String[] row : phoneBook) {
					for (String elem : row) {
						out.write(elem +"\t \t");
					}
					out.write("\n");
				}
				out.close();
		
		
	} catch (IOException exc) {
		System.out.println("Write Error.");
	}
	return phoneBook;
}
}