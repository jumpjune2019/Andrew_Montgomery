import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class assignment08_StringArray {
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
    
    public static boolean arrayHasExactMatch(String []arrayString, String string, boolean yesOrNo) {
        
        
        // Convert String Array to List
        List<String> list = Arrays.asList(arrayString);
        
        // false if string is empty return false
        if(string==null) {
            return false;
        }
        // the boolean decides if we want to check for case sencitive or not.
        if (yesOrNo) {
            // check case sencitive
              
            //if string in array true
            if(list.contains(string)) {
                return true;
                // if string not in array false
            }else {
                return false;
            }
            
        }else if(!yesOrNo) {
            //check noncase sencitive
            
            
            for(int i = 0; i<list.size();i++ ) {
                
                if((list.get(i).toLowerCase().equals(string.toLowerCase()))) {
                    return true;
                }
            }
            //if string in array true
            // if string not in array false
        }
        // find how to check array with case sensitive and without. 
        
        
         
        return yesOrNo;
    }
    
    public static int[] indexOfOccuranceInArray(String[] array, String string, boolean maybe) {
        
        List<Integer> listIndexes = new ArrayList<Integer>() ;
        // Convert String Array to List
        List<String> list = Arrays.asList(array);
        
        // false if string is empty return false
        if(string==null) {
            listIndexes.add(-1);
        }
        // the boolean decides if we want to check for case sencitive or not.
        if (maybe) {
            // check case sencitive
              
            //if string in array true
                for(int i = 0; i<list.size();i++ ) {
                
                    if((list.get(i).equals(string))) {
                        listIndexes.add(list.indexOf(list.get(i)));
                        }
                    }
                if(listIndexes.size()==0) { 
                    listIndexes.add(-1);
                    
                    
                }
            }else if(!maybe) {
            //check noncase sencitive
            
            
            for(int i = 0; i<list.size();i++ ) {
                
                if((list.get(i).toLowerCase().equals(string.toLowerCase()))) {
                    listIndexes.add(list.indexOf(list.get(i)));
                }
            }
            //if string in array true
            // if string not in array false
        }
        int[] indexes = new int[list.size()];
        // dump listIndexes in to array indexes
        for (int b=0;b<listIndexes.size();b++) {
            indexes[b]=listIndexes.get(b);
        }
        
        
        return indexes;
    }
    public static String printArray(int[] array) {
        String arrayIndexes = "";
        for(int i=0;i<array.length;i++) {
            if(array[i]== 0){}else {arrayIndexes += (" returns ["+array[i]+"] ");} 
        }
        return arrayIndexes;
    }
}
