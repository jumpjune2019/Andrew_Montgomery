
public class assignment02_HeadOrTailTally {

	public static void main(String[] args) {
		tally();
	}
	
	public static void tally() {
//		The array is going to hold how many tally occurences.
		int[] counter = {0,0};
//		For the loop to roll the dice 1000 times
		for (int i = 1; i <1001; i++) {
			int face = randomGenerator();
			if(face == 1) {
				counter[0]++;
			}else {
				counter[1]++;
			}
			
		}
		System.out.println("1000 Coin Flips \n"+ "Count of Head: " + counter[0] + "\n"+ "Count of Tail: " + counter[1]);
	}
	
	public static int randomGenerator() {
		int face = 1;
		face = (int)(Math.random()*2+1);
		return face;
	}

}
