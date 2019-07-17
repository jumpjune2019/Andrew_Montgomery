package com.andrewmontgomery;

import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Sorted<Integer> sortInt;
        Sorted<String> sortString;
        Integer intArr[] = {10, 3, 4, 15, 7, 1, 21,20,1985};
        String stringArr[] = { "claude", "Phil", "lois","joel", "clark", "Arthur", "Mera", "bruce","Joel" };


        sortInt = (someArray, ascDSC, LcUc) -> {

            Collections.sort(Arrays.asList(someArray));
            if(ascDSC == true) {
                return someArray;
            }else {
                Collections.reverse(Arrays.asList(someArray));
                return someArray;
            }

        };

        sortString = (someArray, ascDSC, LcUc) -> {

            if(LcUc == true) {
                Collections.sort(Arrays.asList(someArray));
            }else {
                Collections.sort(Arrays.asList(someArray), String.CASE_INSENSITIVE_ORDER);
            }

            if(ascDSC == true) {
                return someArray;
            }else {
                Collections.reverse(Arrays.asList(someArray));
                return someArray;
            }

        };

        System.out.print("Integer array before sort: ");
        printIntArray(intArr);
        System.out.print("ASC: " );
        printIntArray(sortInt.sort(intArr, true, false));
        System.out.print("DESC: " );
        printIntArray(sortInt.sort(intArr, false, false));
        System.out.println();
        System.out.print("String array before sort: ");
        printStringArray(stringArr);
        System.out.print("ASC  cs : " );
        printStringArray(sortString.sort(stringArr, true, true));
        System.out.print("ASC non cs : " );
        printStringArray(sortString.sort(stringArr, true, false));
        System.out.print("DESC cs: " );
        printStringArray(sortString.sort(stringArr, false, true));
        System.out.print("DESC non cs: " );
        printStringArray(sortString.sort(stringArr, false, false));

    }

    public static void printIntArray(Integer[] array) {

        System.out.print("{ ");
        for(int i=0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1] + " }");

    }

    public static void printStringArray(String[] array) {

        System.out.print("{");
        for(int i=0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1] + "}");

    }

}