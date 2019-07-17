package com.andrewmontgomery;

public class Main {
    public static void main(String[] args){
        Integer [] array = {1,2,3,4,5,6,7};
        String [] stringArray={"One","Two","Three"};
        System.out.println("Integer array and String array before Swap");

        pringArray(array);
        pringArray(stringArray);
        swapArrayElements(array);
        swapArrayElements(stringArray);
        System.out.println("Integer array and String array After Swap");
        pringArray(array);
        pringArray(stringArray);
    }


    public static <E> void swapArrayElements(E[] inputArray) {
        // display array elements
        Integer howLong = inputArray.length;
        E holder = inputArray[howLong-1];
        inputArray[howLong-1]= inputArray[0];
        inputArray[0]=holder;



    }
    public static <E> void pringArray(E[] array){
        for(E element:array){

            System.out.print(element+" ");


        }
        System.out.println();
    }
}
