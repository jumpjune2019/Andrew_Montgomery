// Room Object

public class Room {
	// Room Object Fields
	// Making the variables "Private" so they will only be accessed in the Room Class
	
    private String Row;
    private String seat_1;
    private String seat_2;
    private String seat_3;
    private String seat_4;
    private String seat_5;
    private String seat_6;
    private String seat_7;
    private String seat_8;
    private String seat_9;
    private String seat_10;


    // Room Constructor
    Room ( String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String ten, String row) {
         this.Row   = row;
        this.seat_1  = one;
        this.seat_2  = two ;
        this.seat_3  = three  ;
        this.seat_4  = four ;
        this.seat_5  = five ;
        this.seat_6  = six ;
        this.seat_7  = seven ;
        this.seat_8  = eight ;
        this.seat_9  =  nine;
        this.seat_10 = ten ;


    }

    // Create a get method to return "Row"
    public String getRow() {
        return Row;
    }

    // Create a set method for "Row"
    public void setRow(String row) {
        this.Row = row;
    }

    // Create a get method to return "seat_1"
    public String getFirstSeat() {
        return seat_1;
    }

    // Create a set method for "seat_1"
    public void setFirstSeat(String firstSeat) {
        this.seat_1 = firstSeat;
    }

    // Create a get method to return "seat_2"
    public String getSecondSeat() {
        return seat_2;
    }

    // Create a set method for "seat_2"
    public void setSecondSeat(String secondSeat) {
        this.seat_2 = secondSeat;
    }

    // Create a get method to return "seat_3"
    public String getThirdSeat() {
        return seat_3;
    }

    // Create a set method for "seat_3"
    public void setThirdSeat(String thirdSeat) {
        this.seat_3 = thirdSeat;
    }

    // Create a get method to return "seat_4"
    public String getFourthSeat() {
        return seat_4;
    }

    // Create a set method for "seat_4"
    public void setFourthSeat(String fourthSeat) {
        this.seat_4 = fourthSeat;
    }

    // Create a get method to return "seat_5"
    public String getFifthSeat() {
        return seat_5;
    }

    // Create a set method for "seat_5"
    public void setFifthSeat(String fifthSeat) {
        this.seat_5 = fifthSeat;
    }

    // Create a get method to return "seat_6"
    public String getSixthSeat() {
        return seat_6;
    }

    // Create a set method for "seat_6"
    public void setSixthSeat(String sixthSeat) {
        this.seat_6 = sixthSeat;
    }

    // Create a get method to return "seat_7"
    public String getSeventhSeat() {
        return seat_7;
    }

    // Create a set method for "seat_7"
    public void setSeventhSeat(String seventhSeat) {
        this.seat_7 = seventhSeat;
    }

    // Create a get method to return "seat_8"
    public String getEighthSeat() {
        return seat_8;
    }

    // Create a set method for "seat_8"
    public void setEighthSeat(String eighthSeat) {
        this.seat_8 = eighthSeat;
    }

    // Create a get method to return "seat_9"
    public String getNinthSeat() {
        return seat_9;
    }

    // Create a set method for "seat_9"
    public void setNinthSeat(String ninthSeat) {
        this.seat_9 = ninthSeat;
    }

    // Create a get method to return "seat_10"
    public String getTenthSeat() {
        return seat_10;
    }

    // Create a set method for "seat_10"
    public void setTenthSeat(String tenthSeat) {
        this.seat_10 = tenthSeat;
    }


    // Create a get method to return the "fullRoomString"
    String getFullRoomString() {
        String fullRoomString = ("Row " + Row  + 
        								seat_1 + " , " + 
        								seat_2 + " , " + 
        								seat_3 + " , " + 
        								seat_4 + " , " + 
        								seat_5 + " , " +
        								seat_6 + " , " + 
        								seat_7 + " , " + 
        								seat_8 + " , " + 
        								seat_9 + " , " + 
        								seat_10 );
        
        return fullRoomString;
    }

}

