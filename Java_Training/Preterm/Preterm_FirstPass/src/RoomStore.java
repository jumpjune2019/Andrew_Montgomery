// RoomStore Object

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RoomStore {
    // RoomStore Object Fields
    private int Count;
    private String filename;
    
    // Create an array for the RoomStore Object
    private Room[] Theatre;

    //RoomStore Constructor
    RoomStore(String f) throws IOException {
    	
        // Set the number of clients per room to 25
        // Hard Coded 25 clients
        Theatre = new Room[25];

        // Initialize the Count variable to 0
        Count = 0;
        filename = f;
        
        boolean success = loadRoomFromFile(f);
        
        // Create an exception message if the file doesn't load properly.
        if(!success){
            //problems
            System.out.println("The file was not loaded properly, data store empty.");
        }

    }
    
    // Create an add room method
   void addRoom(Room room){
        if (Count < 25) {
            Theatre[Count]= room;
            Count++;
        }else{
            System.out.println("We have reached the limit of 25 clients per room.");
        }
   }
   
    boolean loadRoomFromFile(String f) {
        // The file will be configured as a Comma Separated Value (CSV) file.
        String fileLine;
        String[] record;

        boolean first = true;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while ((fileLine = br.readLine()) != null) {
                // skip the first line of the CSV
                // it contains the field names
                if(first == true) {
                    first = false;
                    continue;
                }
                record = fileLine.split(",");

                Room room = new Room(record[1],record[2],record[3],record[4],record[5],record[6],record[7],record[8],record[9],record[10],record[0]);
                //test to see if room is getting values

                addRoom(room);

            }

        } catch(IOException exc) {
            System.out.println("IO Error: " + exc);
        }

        return true;
    }


    //return empty room

    Room[]getClientRoom(){
        return Theatre;
    }

    int getRoomDataCount(){
        return Count;
    }

}
