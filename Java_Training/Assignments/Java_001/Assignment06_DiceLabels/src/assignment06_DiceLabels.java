
public class assignment06_DiceLabels {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        matrix();
    }
    public static void matrix() {
        String [][] matrix = {{"","Die1","Die 2","Die3","Die 4","Die 5","Die 6"},
                            {"Die 1","Snake Eyes","Australian yo","Little Joe From Kokomo","No field five","Easy six","Six one your'are done"},
                            {"Die 2","Ace caught a deuce","Ballerina","the fever","Jimmie Hicks","Benny Blue","Easy Eight"},
                            {"Die 3","Easy four","OJ","Brooklyn Forest","Big Red","Eighter from Decatur","Nina from Pasadena"},
                            {"Die 4","Little Phoebe","Easy six","Skinny McKinney","Square pair","Railroad nine","Big one on the end"},
                            {"Die 5","Sixie from Dixie","Skinny Dugan","Easy eight","Jesse James","Puppy paws","yo"},
                            {"Die 6","The Devil","Easy eight","Lou Brown","Tennessee","Six five no jive","Mignight"}};
        
        
        for (String[] row : matrix) {
            for (String elem : row) {
                System.out.format("%-23s ", elem );
            }
            System.out.println();
        }
        System.out.println();   
    }
}