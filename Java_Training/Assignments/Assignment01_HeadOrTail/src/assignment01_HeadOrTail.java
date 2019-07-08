
public class assignment01_HeadOrTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Coin Flip Program " +"\n"+"The Coin Flip is:"
				+ " "+ headOrTail(randomGenerator()));
//		

	}
	
//	Be able to generate a number between 1 and 2
	public static int randomGenerator() {
		int face = 1;
		face = (int)(Math.random()*2+1);
		return face;
	}
	
//	create another method that will take a value and will assign “Head” if 1 is passed, “Tail” if 2 is passed.
	public static String headOrTail(int random) {
		String face = "";
		if(random == 1) {
			face = "Head";
		}else if(random == 2) {
			face = "Tail";
		} else {
			face = "We do not have the right dice.";
		}
		return face;
		
	}

}

