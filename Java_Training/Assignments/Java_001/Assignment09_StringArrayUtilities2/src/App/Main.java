package App;
import static ArrayUtils.assignment09_StringArrayUtilities2.*;

public class Main {

	   public static void main(String[] args) {
	        String[] myList = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};// TODO Auto-generated method stub
	        System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
	        System.out.println("The array to test contains the following items");
	        System.out.println("{\"Bozo\", \"FooBar\", \"Delta\", \"Foozball\", \"Demo\", \"Money\", \"Zoo\"}");
	        System.out.println("Scenario 1");
	        System.out.println("arrayHasExactMatch(myList, \"zo\", false): is "+ arrayHasExactMatch(myList,"zo",false));
	        System.out.println("Scenario 2");
	        System.out.println("arrayHasExactMatch (myList, \"zoo\", false);"+arrayHasExactMatch (myList, "zoo", false));
	        System.out.println("Scenario 3");
	        System.out.println("arrayHasExactMatch (myList, \"zoo\", true)"+arrayHasExactMatch (myList, "zoo", true));
	        System.out.println("Scenario 4");
	        System.out.println("arrayHasExactMatch (myList, \"foo\", true)"+arrayHasExactMatch (myList, "foo", true));
	        System.out.println("Scenario 5");
	        System.out.println("arrayHasExactMatch (myList, \"foo\", false)"+arrayHasExactMatch (myList, "foo", false));
	        System.out.println("Scenario 6");
	        System.out.println("arrayHasExactMatch (myList, \"delta\", true)"+arrayHasExactMatch (myList, "delta", true));
	        System.out.println("Scenario 7");
	        System.out.println("arrayHasExactMatch (myList, \"Delta\", true)"+arrayHasExactMatch (myList, "Delta", true));
	        System.out.println("Scenario 8");
	        System.out.println("indexOfOccuranceInArray (myList, \"zo\", false)"+printArray(indexOfOccuranceInArray (myList, "zo", false)));
	        System.out.println("Scenario 9");
	        System.out.println("indexOfOccuranceInArray (myList, \"zoo\", true)"+printArray(indexOfOccuranceInArray (myList, "zoo", true)));
	        System.out.println("Scenario 10");
	        System.out.println("indexOfOccuranceInArray (myList, \"zoo\", false)"+printArray(indexOfOccuranceInArray (myList, "zoo", false)));
	        System.out.println("Scenario 11");
	        System.out.println("indexOfOccuranceInArray (myList, \"foo\", true)"+printArray(indexOfOccuranceInArray (myList, "foo", true)));
	        System.out.println("Scenario 12");
	        System.out.println("indexOfOccuranceInArray (myList, \"foo\", false)"+printArray(indexOfOccuranceInArray (myList, "foo", false)));
	        System.out.println("Scenario 13");
	        System.out.println("indexOfOccuranceInArray (myList, \"delta\", true)"+printArray(indexOfOccuranceInArray (myList, "delta", true)));
	        System.out.println("Scenario 14");
	        System.out.println("indexOfOccuranceInArray (myList, \"Delta\", true)"+printArray(indexOfOccuranceInArray (myList, "Delta", true)));
	        
	        
	         
	    
	        
	         
	         
	    }

}
