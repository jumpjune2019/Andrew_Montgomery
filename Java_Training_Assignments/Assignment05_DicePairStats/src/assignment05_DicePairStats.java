public class assignment05_DicePairStats {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        tally();
    }
    
    // print tally
        public static void tally() {
            // array holds tally occurrences. 
            int loop=0;
            int[] counter = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            // for loop to roll the dice 1000 times
            for (int i=1; i<1001;i++) {
                int faceOne = ramdonGenerator();
                int faceTwo = ramdonGenerator();
                if (((faceOne ==1)&&(faceTwo==1))||((faceOne ==1)&&(faceTwo==1))) {
                    counter[0]++ ;
                    }
                if (((faceOne ==1)&&(faceTwo==2))||((faceOne ==2)&&(faceTwo==1))) {
                    counter[1]++ ;
                    }
                if (((faceOne ==1)&&(faceTwo==3))||((faceOne ==3)&&(faceTwo==1))) {
                    counter[2]++ ;
                    }
                if (((faceOne ==1)&&(faceTwo==4))||((faceOne ==4)&&(faceTwo==1))) {
                    counter[3]++ ;
                    }
                if (((faceOne ==1)&&(faceTwo==5))||((faceOne ==5)&&(faceTwo==1))) {
                    counter[4]++ ;
                    }
                if (((faceOne ==1)&&(faceTwo==6))||((faceOne ==6)&&(faceTwo==1))) {
                    counter[5]++ ;
                    }
                if (((faceOne ==2)&&(faceTwo==2))||((faceOne ==2)&&(faceTwo==2))) {
                    counter[6]++ ;
                    }
                if (((faceOne ==2)&&(faceTwo==3))||((faceOne ==3)&&(faceTwo==2))) {
                    counter[7]++ ;
                    }
                if (((faceOne ==2)&&(faceTwo==4))||((faceOne ==4)&&(faceTwo==2))) {
                    counter[8]++ ;
                    }
                if (((faceOne ==2)&&(faceTwo==5))||((faceOne ==5)&&(faceTwo==2))) {
                    counter[9]++ ;
                    }
                if (((faceOne ==2)&&(faceTwo==6))||((faceOne ==6)&&(faceTwo==2))) {
                    counter[10]++ ;
                    }
                if (((faceOne ==3)&&(faceTwo==3))||((faceOne ==3)&&(faceTwo==3))) {
                    counter[11]++ ;
                    }
                if (((faceOne ==3)&&(faceTwo==4))||((faceOne ==4)&&(faceTwo==3))) {
                    counter[12]++ ;
                    }
                if (((faceOne ==3)&&(faceTwo==5))||((faceOne ==5)&&(faceTwo==3))) {
                    counter[13]++ ;
                    }
                if (((faceOne ==3)&&(faceTwo==6))||((faceOne ==6)&&(faceTwo==3))) {
                    counter[14]++ ;
                    }
                if (((faceOne ==4)&&(faceTwo==4))||((faceOne ==4)&&(faceTwo==4))) {
                    counter[15]++ ;
                    }
                if (((faceOne ==4)&&(faceTwo==5))||((faceOne ==5)&&(faceTwo==4))) {
                    counter[16]++ ;
                    }
                if (((faceOne ==4)&&(faceTwo==6))||((faceOne ==6)&&(faceTwo==4))) {
                    counter[17]++ ;
                    }
                if (((faceOne ==5)&&(faceTwo==5))||((faceOne ==5)&&(faceTwo==5))) {
                    counter[18]++ ;
                    }
                if (((faceOne ==5)&&(faceTwo==6))||((faceOne ==6)&&(faceTwo==5))) {
                    counter[19]++ ;
                    }
                if (((faceOne ==6)&&(faceTwo==6))||((faceOne ==6)&&(faceTwo==6))) {
                    counter[20]++ ;
                    }
                
                }
            System.out.println("1000 Random 2 dice toss stats");
            
            System.out.println("Dice 1 and 1: "+ counter[0]+" times."+"\n"
                              +"Dice 1 and 2: "+ counter[1]+" times."+"\n"
                              +"Dice 1 and 3: "+ counter[2]+" times."+"\n"
                              +"Dice 1 and 4: "+ counter[3]+" times."+"\n"
                              +"Dice 1 and 5: "+ counter[4]+" times."+"\n"
                              +"Dice 1 and 6: "+ counter[5]+" times."+"\n"
                              +"Dice 2 and 2: "+ counter[6]+" times."+"\n"
                              +"Dice 2 and 3: "+ counter[7]+" times."+"\n"
                              +"Dice 2 and 4: "+ counter[8]+" times."+"\n"
                              +"Dice 2 and 5: "+ counter[9]+" times."+"\n"
                              +"Dice 2 and 6: "+ counter[10]+" times."+"\n"
                              +"Dice 3 and 3: "+ counter[11]+" times."+"\n"
                              +"Dice 3 and 4: "+ counter[12]+" times."+"\n"
                              +"Dice 3 and 5: "+ counter[13]+" times."+"\n"
                              +"Dice 3 and 6: "+ counter[14]+" times."+"\n"
                              +"Dice 4 and 4: "+ counter[15]+" times."+"\n"
                              +"Dice 4 and 5: "+ counter[16]+" times."+"\n"
                              +"Dice 4 and 6: "+ counter[17]+" times."+"\n"
                              +"Dice 5 and 5: "+ counter[18]+" times."+"\n"
                              +"Dice 5 and 6: "+ counter[19]+" times."+"\n"
                              +"Dice 6 and 6: "+ counter[20]+" times."+"\n"
                              
                        );
            
            
            
            
            
        }
        
        // Generate random between 1 and 2
        public static int ramdonGenerator() {
            int face = 1;
            face = (int) (Math.random()*6)+1;
            return face;
        }
}