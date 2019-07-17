package com.andrewmontgomery;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException, InterruptedException {
        Labelling labels;
        RollingDice rolling;
        labels = (one, two)->{
            String label = "";
            String [][] matrix = {
                    {"Snake Eyes","Australian yo","Little Joe From Kokomo","No field five","Easy six","Six one your'are done"},
                    {"Ace caught a deuce","Ballerina","the fever","Jimmie Hicks","Benny Blue","Easy Eight"},
                    {"Easy four","OJ","Brooklyn Forest","Big Red","Eighter from Decatur","Nina from Pasadena"},
                    {"Little Phoebe","Easy six","Skinny McKinney","Square pair","Railroad nine","Big one on the end"},
                    {"Sixie from Dixie","Skinny Dugan","Easy eight","Jesse James","Puppy paws","yo"},
                    {"The Devil","Easy eight","Lou Brown","Tennessee","Six five no jive","Mignight"}};

            if ((one ==1)&&(two==1)) {
                label = matrix[0][0];
            }
            if ((one ==1)&&(two==2)) {
                label = matrix[0][1];
            }
            if ((one ==1)&&(two==3)) {
                label = matrix[0][2];
            }
            if ((one ==1)&&(two==4)) {
                label = matrix[0][3];
            }
            if ((one ==1)&&(two==5)) {
                label = matrix[0][4];
            }
            if ((one ==1)&&(two==6)) {
                label = matrix[0][5];
            }
            if ((one ==2)&&(two==1)) {
                label = matrix[1][0];
            }
            if ((one ==2)&&(two==2)) {
                label = matrix[1][1];
            }
            if ((one ==2)&&(two==3)) {
                label = matrix[1][2];
            }
            if ((one ==2)&&(two==4)) {
                label = matrix[1][3];
            }
            if ((one ==2)&&(two==5)) {
                label = matrix[1][4];
            }
            if ((one ==2)&&(two==6)) {
                label = matrix[1][5];
            }
            if ((one ==3)&&(two==1)) {
                label = matrix[2][0];
            }
            if ((one ==3)&&(two==2)) {
                label = matrix[2][1];
            }
            if ((one ==3)&&(two==3)) {
                label = matrix[2][2];
            }
            if ((one ==3)&&(two==4)) {
                label = matrix[2][3];
            }
            if ((one ==3)&&(two==5)) {
                label = matrix[2][4];
            }
            if ((one ==3)&&(two==6)) {
                label = matrix[2][5];
            }
            if ((one ==4)&&(two==1)) {
                label = matrix[3][0];
            }
            if ((one ==4)&&(two==2)) {
                label = matrix[3][1];
            }
            if ((one ==4)&&(two==3)) {
                label = matrix[3][2];
            }
            if ((one ==4)&&(two==4)) {
                label = matrix[3][3];
            }
            if ((one ==4)&&(two==5)) {
                label = matrix[3][4];
            }
            if ((one ==4)&&(two==6)) {
                label = matrix[3][5];
            }
            if ((one ==5)&&(two==1)) {
                label = matrix[4][0];
            }
            if ((one ==5)&&(two==2)) {
                label = matrix[4][1];
            }
            if ((one ==5)&&(two==3)) {
                label = matrix[4][2];
            }
            if ((one ==5)&&(two==4)) {
                label = matrix[4][3];
            }
            if ((one ==5)&&(two==5)) {
                label = matrix[4][4];
            }
            if ((one ==5)&&(two==6)) {
                label = matrix[4][5];
            }
            if ((one ==6)&&(two==1)) {
                label = matrix[5][0];
            }
            if ((one ==6)&&(two==2)) {
                label = matrix[5][1];
            }
            if ((one ==6)&&(two==3)) {
                label = matrix[5][2];
            }
            if ((one ==6)&&(two==4)) {
                label = matrix[5][3];
            }
            if ((one ==6)&&(two==5)) {
                label = matrix[5][4];
            }
            if ((one ==6)&&(two==6)) {
                label = matrix[5][5];
            }

            return label;
        };
        rolling = ()->{
            String result = "";
            String typeOfWin = "";
            final String COMPUTERLOOSES="You win!!";
            final String COMPUTERLOOSESONTIE="Damn! You win on a Double! What Luck!";
            final String COMPUTERWINSONTIE="Damn! I win on a Double! Ah! I pity you fool!";
            final String COMPUTERTIES="Stalemate! You’re tough, let’s try for a tie-breaker Press any key and ENTER to throw your dice or press (Q or q) to quit";

            int userDiceOne, userDiceTwo, computerDiceOne, computerDiceTwo, userTotal,computerTotal;
            userDiceOne=ramdonGenerator();
            userDiceTwo =ramdonGenerator();
            computerDiceOne =ramdonGenerator();
            computerDiceTwo =ramdonGenerator();
            userTotal =userDiceOne + userDiceTwo;
            computerTotal= computerDiceOne + computerDiceTwo;
            // MAKE OPTION FOR TYPE OF WIN ASSIGN PROPER VARIABLE. 4 TIPES OF IFS STATEMENT WILL RUN FOR EVERY TIPE
            // OF WIN THERE IS TO BE.
            System.out.println("Rolling the dice!!");
            System.out.println("You have rolled a "+ userDiceOne+ " and "+ userDiceTwo+ " the "+ labels.label(userDiceOne,userDiceTwo));
            System.out.println("I have rolled a "+ computerDiceOne+ " and "+ computerDiceTwo+ " the "+ labels.label(computerDiceOne,computerDiceTwo));
            if(userTotal>computerTotal) {
                //checking type of win by user
                if (userDiceOne == userDiceTwo) {
                    System.out.println(COMPUTERLOOSESONTIE);
                }else {
                    System.out.println(COMPUTERLOOSES);
                }

                //will stop the program from running for 10 to give time to the user
                // to check the results from previous game then keep going.
                java.util.concurrent.TimeUnit.SECONDS.sleep(10);
                System.out.print("Did you cheat?? Gimme another try, c’mon Press any key and ENTER to throw your dice or press (Q or q) to quit");
                char key;

                // Read a character from the keyboard.
                System.in.skip(System.in.available());
                key = (char) System.in.read(); // get a char

                if ((key =='Q')||(key =='q')) {
                    System.out.println("Thanks for being a sport! laters!");


                }else {

                    rollDice();
                }
            }else if (userTotal<computerTotal) {
                if (computerDiceOne == computerDiceTwo) {
                    System.out.println(COMPUTERWINSONTIE);
                    //will stop the program from running for 10 to give time to the user
                    // to check the results from previous game then keep going.
                    java.util.concurrent.TimeUnit.SECONDS.sleep(10);
                    System.out.print("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
                    char key;

                    // Read a character from the keyboard.
                    System.in.skip(System.in.available());
                    key = (char) System.in.read(); // get a char

                    if ((key =='Q')||(key =='q')) {
                        System.out.println("Thanks for being a sport! laters!");


                    }else {

                        rollDice();
                    }
                }
            }else if(userTotal==computerTotal) {
                System.out.println(COMPUTERTIES);
                //will stop the program from running for 10 to give time to the user
                // to check the results from previous game then keep going.
                java.util.concurrent.TimeUnit.SECONDS.sleep(10);
                char key;

                // Read a character from the keyboard.
                System.in.skip(System.in.available());
                key = (char) System.in.read(); // get a char

                if ((key =='Q')||(key =='q')) {
                    System.out.println("Thanks for being a sport! laters!");


                }else rolling.roll.apply();

            }


            return result;
        };

    }

    // letsPlay();


    public static int ramdonGenerator() {
        int face = 1;
        face = (int) (Math.random()*6)+1;
        return face;
    }
    // printing die

    public static void letsPlay() throws IOException, InterruptedException {
        char key;
        boolean computerWon = false;
        System.out.println("Welcome to the dice throw challenge!");
        System.out.println("Do you feel lucky? Do ya?");

        System.out.print("Press any key and ENTER to throw your dice or press (Q or q) to quit");
        // Read a character from the keyboard.
        key = (char) System.in.read(); // get a char
        if (key == 'Q'|| key =='q') {
            System.out.println("See ya later Alligator!");
        }else {

            rollDice();
        }


    }


    /*public static String rollDice() throws IOException, InterruptedException {
        String result = "";
        String typeOfWin = "";
        final String COMPUTERLOOSES="You win!!";
        final String COMPUTERLOOSESONTIE="Damn! You win on a Double! What Luck!";
        final String COMPUTERWINSONTIE="Damn! I win on a Double! Ah! I pity you fool!";
        final String COMPUTERTIES="Stalemate! You’re tough, let’s try for a tie-breaker Press any key and ENTER to throw your dice or press (Q or q) to quit";
        int userDiceOne, userDiceTwo, computerDiceOne, computerDiceTwo, userTotal,computerTotal;
        userDiceOne=ramdonGenerator();
        userDiceTwo =ramdonGenerator();
        computerDiceOne =ramdonGenerator();
        computerDiceTwo =ramdonGenerator();
        userTotal =userDiceOne + userDiceTwo;
        computerTotal= computerDiceOne + computerDiceTwo;
        // MAKE OPTION FOR TYPE OF WIN ASSIGN PROPER VARIABLE. 4 TIPES OF IFS STATEMENT WILL RUN FOR EVERY TIPE
        // OF WIN THERE IS TO BE.
        System.out.println("Rolling the dice!!");
        System.out.println("You have rolled a "+ userDiceOne+ " and "+ userDiceTwo+ " the "+ label(userDiceOne,userDiceTwo));
        System.out.println("I have rolled a "+ computerDiceOne+ " and "+ computerDiceTwo+ " the "+ label(computerDiceOne,computerDiceTwo));
        if(userTotal>computerTotal) {
            //checking type of win by user
            if (userDiceOne == userDiceTwo) {
                System.out.println(COMPUTERLOOSESONTIE);
            }else {
                System.out.println(COMPUTERLOOSES);
            }
            //will stop the program from running for 10 to give time to the user
            // to check the results from previous game then keep going.
            java.util.concurrent.TimeUnit.SECONDS.sleep(10);
            System.out.print("Did you cheat?? Gimme another try, c’mon Press any key and ENTER to throw your dice or press (Q or q) to quit");
            char key;
            // Read a character from the keyboard.
            System.in.skip(System.in.available());
            key = (char) System.in.read(); // get a char
            if ((key =='Q')||(key =='q')) {
                System.out.println("Thanks for being a sport! laters!");
            }else {
                rollDice();
            }
        }else if (userTotal<computerTotal) {
            if (computerDiceOne == computerDiceTwo) {
                System.out.println(COMPUTERWINSONTIE);
                //will stop the program from running for 10 to give time to the user
                // to check the results from previous game then keep going.
                java.util.concurrent.TimeUnit.SECONDS.sleep(10);
                System.out.print("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
                char key;
                // Read a character from the keyboard.
                System.in.skip(System.in.available());
                key = (char) System.in.read(); // get a char
                if ((key =='Q')||(key =='q')) {
                    System.out.println("Thanks for being a sport! laters!");
                }else {
                    rollDice();
                }
            }
        }else if(userTotal==computerTotal) {
            System.out.println(COMPUTERTIES);
            //will stop the program from running for 10 to give time to the user
            // to check the results from previous game then keep going.
            java.util.concurrent.TimeUnit.SECONDS.sleep(10);
            char key;
            // Read a character from the keyboard.
            System.in.skip(System.in.available());
            key = (char) System.in.read(); // get a char
            if ((key =='Q')||(key =='q')) {
                System.out.println("Thanks for being a sport! laters!");
            }else {
                rollDice();
            }
        }
        return result;
    }*/
   /* //return label vase on two ints
    public static String label(int one, int two) {
        String label = "";
        String [][] matrix = {
                {"Snake Eyes","Australian yo","Little Joe From Kokomo","No field five","Easy six","Six one your'are done"},
                {"Ace caught a deuce","Ballerina","the fever","Jimmie Hicks","Benny Blue","Easy Eight"},
                {"Easy four","OJ","Brooklyn Forest","Big Red","Eighter from Decatur","Nina from Pasadena"},
                {"Little Phoebe","Easy six","Skinny McKinney","Square pair","Railroad nine","Big one on the end"},
                {"Sixie from Dixie","Skinny Dugan","Easy eight","Jesse James","Puppy paws","yo"},
                {"The Devil","Easy eight","Lou Brown","Tennessee","Six five no jive","Mignight"}};
        if ((one ==1)&&(two==1)) {
            label = matrix[0][0];
        }
        if ((one ==1)&&(two==2)) {
            label = matrix[0][1];
        }
        if ((one ==1)&&(two==3)) {
            label = matrix[0][2];
        }
        if ((one ==1)&&(two==4)) {
            label = matrix[0][3];
        }
        if ((one ==1)&&(two==5)) {
            label = matrix[0][4];
        }
        if ((one ==1)&&(two==6)) {
            label = matrix[0][5];
        }
        if ((one ==2)&&(two==1)) {
            label = matrix[1][0];
        }
        if ((one ==2)&&(two==2)) {
            label = matrix[1][1];
        }
        if ((one ==2)&&(two==3)) {
            label = matrix[1][2];
        }
        if ((one ==2)&&(two==4)) {
            label = matrix[1][3];
        }
        if ((one ==2)&&(two==5)) {
            label = matrix[1][4];
        }
        if ((one ==2)&&(two==6)) {
            label = matrix[1][5];
        }
        if ((one ==3)&&(two==1)) {
            label = matrix[2][0];
        }
        if ((one ==3)&&(two==2)) {
            label = matrix[2][1];
        }
        if ((one ==3)&&(two==3)) {
            label = matrix[2][2];
        }
        if ((one ==3)&&(two==4)) {
            label = matrix[2][3];
        }
        if ((one ==3)&&(two==5)) {
            label = matrix[2][4];
        }
        if ((one ==3)&&(two==6)) {
            label = matrix[2][5];
        }
        if ((one ==4)&&(two==1)) {
            label = matrix[3][0];
        }
        if ((one ==4)&&(two==2)) {
            label = matrix[3][1];
        }
        if ((one ==4)&&(two==3)) {
            label = matrix[3][2];
        }
        if ((one ==4)&&(two==4)) {
            label = matrix[3][3];
        }
        if ((one ==4)&&(two==5)) {
            label = matrix[3][4];
        }
        if ((one ==4)&&(two==6)) {
            label = matrix[3][5];
        }
        if ((one ==5)&&(two==1)) {
            label = matrix[4][0];
        }
        if ((one ==5)&&(two==2)) {
            label = matrix[4][1];
        }
        if ((one ==5)&&(two==3)) {
            label = matrix[4][2];
        }
        if ((one ==5)&&(two==4)) {
            label = matrix[4][3];
        }
        if ((one ==5)&&(two==5)) {
            label = matrix[4][4];
        }
        if ((one ==5)&&(two==6)) {
            label = matrix[4][5];
        }
        if ((one ==6)&&(two==1)) {
            label = matrix[5][0];
        }
        if ((one ==6)&&(two==2)) {
            label = matrix[5][1];
        }
        if ((one ==6)&&(two==3)) {
            label = matrix[5][2];
        }
        if ((one ==6)&&(two==4)) {
            label = matrix[5][3];
        }
        if ((one ==6)&&(two==5)) {
            label = matrix[5][4];
        }
        if ((one ==6)&&(two==6)) {
            label = matrix[5][5];
        }
        return label;
    }*/
}