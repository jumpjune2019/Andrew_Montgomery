package matrixcustomhandler;

import static matrixcustomhandler.martixmethod;
import static matrixcustomhandlers.MatrixCustomHandlers.*;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MatrixCustomHandler {
	public static void main(String[] args) throws IOException {
	
		pickChoice();
		
	}
	public static void pickChoice() throws IOException {
		try {
		char key;
		
		System.out.print("Pick a number to print your matrix:(press number then enter)\n"+
				"   1) print on screen only\r\n" + 
				"	2) print on file\r\n" + 
				"	3) print on both");
		// Read a character from the keyboard.
		key = (char) System.in.read(); // get a char
		if (key == '1') {
			printToScreen();
		}else if (key == '2') {
			printToFile();
		}else if (key == '3') {
			printToScreen();
			printToFile();
		}else if((key != '1')||(key != '2')||(key != '3')) {
			// how to call my custom handler
				throw new WrongKeySelectedHandler(key);
		}
		}catch(WrongKeySelectedHandler exc) {
			System.out.println(exc);
		}
		
	}
	public static void printToScreen() {
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
			
			matrix();
			
		} catch (IOException exc) {
			System.out.println("Write Error.");
		}
	}
	public static void printToFile() throws IOException {
		System.out.println("A file was created in your sourse file");
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
			//create file
					FileWriter fw = new FileWriter("aaaaaaaaaaaaaaaa.txt");
					BufferedWriter out= new BufferedWriter(fw);
					
					String [][] matrix = {{"","Die1","Die 2","Die3","Die 4","Die 5","Die 6"},
							{"Die 1","Snake Eyes","Australian yo","Little Joe From Kokomo","No field five","Easy six","Six one your'are done"},
							{"Die 2","Ace caught a deuce","Ballerina","the fever","Jimmie Hicks","Benny Blue","Easy Eight"},
							{"Die 3","Easy four","OJ","Brooklyn Forest","Big Red joel","Eighter from Decatur did","Nina from Pasadena this"},
							{"Die 4","Little Phoebe","Easy six","Skinny McKinney","Square pair","Railroad nine","Big one on the end"},
							{"Die 5","Sixie from Dixie","Skinny Dugan","Easy eight","Jesse James","Puppy paws","yo"},
							{"Die 6","The Devil","Easy eight","Lou Brown","Tennessee","Six five no jive","Mignight"}};


					for (String[] row : matrix) {
						for (String elem : row) {
							out.write(elem +"\t \t");
						}
						out.write("\n");
					}
					out.close();
			
			
		} catch (IOException exc) {
			System.out.println("Write Error.");
		}

		
	}
	
}