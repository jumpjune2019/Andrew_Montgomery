import java.io.IOException;

public class assignment03_SimpleDie {

	public static void main(String[] args)throws java.io.IOException {
		
		letsPlay();

	}
	
	public static int randomGenerator() {
		int face = 1;
		face = (int)(Math.random()*6)+1;
		return face;
	}
	
	public static void printDie(int dieFace) {
		System.out.println("You have rolled a " + dieFace);
	}
	
	public static void letsPlay() throws IOException {
		char key;
		
		System.out.print("Press any key to throw a die and press Enter ( or Q and Enter to quit):");
//		Read a character from the keyboard.
		key = (char) System.in.read();
		if (key == 'Q') {
			System.out.println("Thanks for not playing");
		} else {
			printDie(randomGenerator());
		}
		letsPlayAgain();
	}
	
	public static void letsPlayAgain() throws IOException {
		char key;

		System.out.print("Play Again? (Y or y) and Enter, any other key and Enter to Quit: ");
//		Read a character from the keyboard.
		System.in.skip(System.in.available());
		key = (char) System.in.read();
		
		if((key == 'y')||(key == 'Y')) {
			printDie(randomGenerator());
			
			letsPlayAgain();
		} else {
			System.out.println("Thanks for playing");
		}
		
	}
	

}
