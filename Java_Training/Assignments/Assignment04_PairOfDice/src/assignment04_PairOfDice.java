import java.io.IOException;

public class assignment04_PairOfDice {

	public static void main(String[] args)throws java.io.IOException {
		
		letsPlay();

	}
	
	public static int randomGenerator() {
		int face = 1;
		face = (int)(Math.random()*6)+1;
		return face;
	}
	
	public static void printDie() {
		int dieOne = randomGenerator();
		int dieTwo = randomGenerator();
		System.out.println("You have rolled the following: ");
		System.out.println("First Die: " + dieOne+ "\n" + "Second Die: "+ dieTwo );
	}
	
	public static void letsPlay() throws IOException {
		char key;
		
		System.out.print("Press any key to throw a die and press Enter ( or Q and Enter to quit):");
//		Read a character from the keyboard.
		key = (char) System.in.read();
		if (key == 'Q') {
			System.out.println("Thanks for not playing");
		} else {
			printDie();
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
			printDie();
			
			letsPlayAgain();
		} else {
			System.out.println("Thanks for playing");
		}
		
	}

}
