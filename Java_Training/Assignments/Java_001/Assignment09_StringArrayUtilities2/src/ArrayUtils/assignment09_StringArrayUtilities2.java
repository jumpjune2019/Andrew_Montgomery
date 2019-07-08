package ArrayUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class assignment09_StringArrayUtilities2  {
 
    
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
