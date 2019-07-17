package com.andrewmontgomery;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int getRandom;
        Random random = new Random();
        String getString;
        RandomN randomN;
        HeadTail headTail;

        randomN = ()->random.nextInt(2)+1;
        headTail = (x)->(x==1)?"Head":"Tail";

        System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
        System.out.println("Press the F key and flip your luck!");

        while(!scanner.next().equalsIgnoreCase("q")){
            getRandom = randomN.getInt();
            getString = headTail.getString(getRandom);

            System.out.println("The coin flip is: "+getString+"!");
            System.out.println("Press the F key to try again, press Q or q to quit");
        }
        scanner.close();
        System.out.println("Thank you for playing");
    }

}
