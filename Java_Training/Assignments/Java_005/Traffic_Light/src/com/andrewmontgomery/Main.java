package com.andrewmontgomery;
// Import the Scanner method to capture user input
import java.util.Scanner;

public class Main {
    // Primary Method
    public static void main(String[] args){

        System.out.println( "At Any time Press Enter to Stop Lights");
        waitForEnter();
    }
    synchronized static void waitForEnter(){
        Lights lights= new Lights("lights");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();

        while(readString.equals("")) {


            if (readString.isEmpty()) {
                System.out.println("Traffic Light Simulator is Done!");
                lights.mystop();


                break;
            }

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }

        }
    }
}