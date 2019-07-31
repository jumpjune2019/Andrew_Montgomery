import java.io.IOException;

public class Main {

	public static void getInput() throws IOException {

		// Create space between each print out on the console
		// For readability
		System.out.println();

		// Create a new ClientStore
		ClientStore myStore = new ClientStore("clients_list.csv");
		// Stores all of our data from "clients_list.csv" into the store array
		Client[] store = myStore.getClientStore();

		// **** Test to make sure the data prints on the console ****
		System.out.println("Test: 1");
		printClientArray(store);
		
		// Create space between each print out on the console
		// For readability
		System.out.println();


		// Create a new myRoomStore
		RoomStore myRoomStore = new RoomStore("room_list.csv");
		// Stores all of our data from "room_list.csv" into the room array
		Room[] room  = myRoomStore.getClientRoom();
		
		// **** Test to make sure the room is filled with empty seats ****
		System.out.println("Test: 2");
		empty(room);

		// print array
		printRoomArray(room);

		//try fill rooms
		fillRoom(room,store);

		// Create space between each print out on the console
		// For readability
		System.out.println();
		//reprinting matrix to show is full

		printRoomArray(room);

		// Create space between each print out on the console
		// For readability
		System.out.println();


		System.out.println("Test 3");
		//get and print seating assignments
		printSeatingAssignment(store);


	}

	public static void printRoomArray(Room[] a){
		for(Room c : a) {
			if(c != null) {
				//c.getFullRoomString()
				System.out.format("%-5s%-3s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%s", "Row",c.getRow(),c.getFirstSeat(),c.getSecondSeat(),c.getThirdSeat(),c.getFourthSeat(),c.getFifthSeat(),c.getSixthSeat(),c.getSeventhSeat(),c.getEighthSeat(),c.getNinthSeat(),c.getTenthSeat(),"\n");

			}

		}
	}

	//set room as empty if needed.
	public static void empty (Room[] a){
		for(Room c : a) {
			if(c != null) {
				if(c.getFirstSeat().equals("")){
					c.setFirstSeat("Empty");
				}
				if(c.getSecondSeat().equals("")){
					c.setSecondSeat("Empty");
				}
				if(c.getThirdSeat().equals("")){
					c.setThirdSeat("Empty");
				}
				if(c.getFourthSeat().equals("")){
					c.setFourthSeat("Empty");
				}
				if(c.getFifthSeat().equals("")){
					c.setFifthSeat("Empty");
				}
				if(c.getSixthSeat().equals("")){
					c.setSixthSeat("Empty");
				}
				if(c.getSeventhSeat().equals("")){
					c.setSeventhSeat("Empty");
				}
				if(c.getEighthSeat().equals("")){
					c.setEighthSeat("Empty");
				}
				if(c.getNinthSeat().equals("")){
					c.setNinthSeat("Empty");
				}
				if(c.getTenthSeat().equals(" ")){
					c.setTenthSeat("Empty");
				}
			}
		}
	}
	
	public static void fillRoom (Room[] c, Client[]b){

		for (int i=0;i<c.length;i++){

			if(c[i] != null) {
				//generates a random client
				String client1 = findRandomClient(b);
				//if seat is empty and the client does not has a seat the client gets the seat.
				if(c[i].getFirstSeat().equals("Empty")&&(!findClientInTheRoom(c,client1))){
					c[i].setFirstSeat(client1);

					setClientSeat(b,client1,c[i].getRow(),"1");

					//figure out whats up with the loop so you can assign the row
				}
				String client2 = findRandomClient(b);
				if(c[i].getSecondSeat().equals("Empty")&&(!findClientInTheRoom(c,client2))){
					c[i].setSecondSeat(client2);
					setClientSeat(b,client2,c[i].getRow(),"2");
				}
				String client3 = findRandomClient(b);
				if(c[i].getThirdSeat().equals("Empty")&&(!findClientInTheRoom(c,client3))){
					c[i].setThirdSeat(client3);
					setClientSeat(b,client3,c[i].getRow(),"3");
				}
				String client4 = findRandomClient(b);
				if(c[i].getFourthSeat().equals("Empty")&&(!findClientInTheRoom(c,client4))){
					c[i].setFourthSeat(client4);
					setClientSeat(b,client4,c[i].getRow(),"4");
				}
				String client5 = findRandomClient(b);
				if(c[i].getFifthSeat().equals("Empty")&&(!findClientInTheRoom(c,client5))){
					c[i].setFifthSeat(client5);
					setClientSeat(b,client5,c[i].getRow(),"5");
				}
				String client6 = findRandomClient(b);
				if(c[i].getSixthSeat().equals("Empty")&&(!findClientInTheRoom(c,client6))){
					c[i].setSixthSeat(client6);
					setClientSeat(b,client6,c[i].getRow(),"6");
				}
				String client7 = findRandomClient(b);
				if(c[i].getSeventhSeat().equals("Empty")&&(!findClientInTheRoom(c,client7))){
					c[i].setSeventhSeat(client7);
					setClientSeat(b,client7,c[i].getRow(),"7");
				}
				String client8 = findRandomClient(b);
				if(c[i].getEighthSeat().equals("Empty")&&(!findClientInTheRoom(c,client8))){
					c[i].setEighthSeat(client8);
					setClientSeat(b,client8,c[i].getRow(),"8");
				}
				String client9 = findRandomClient(b);
				if(c[i].getNinthSeat().equals("Empty")&&(!findClientInTheRoom(c,client9))){
					c[i].setNinthSeat(client9);
					setClientSeat(b,client9,c[i].getRow(),"9");
				}
				String client10 = findRandomClient(b);
				if(c[i].getTenthSeat().equals("Empty")&&(!findClientInTheRoom(c,client10))){
					c[i].setTenthSeat(client10);
					setClientSeat(b,client10,c[i].getRow(),"10");
				}
			}
		}
	}


	public static void printClientArray(Client[]a){
		for(Client c : a) {
			if(c != null) {
				System.out.println(c.getFullClientString());
			}
		}
	}
	// print seating list
	public static void printSeatingAssignment(Client[]a){
		System.out.format("%-23s%-23s%-23s%s","Client","ID","Seat","\n");
		for(Client c : a) {
			if(c != null) {
				System.out.format("%-23s%-23s%-23s%s",c.getClientFirstName(),c.getClientLastName(),c.getSeatAssignment(),"\n");
			}
		}
	}

	// Generate randon between 1 and 2
	public static int randomGenerator() {
		int face = 1;
		face = (int)(Math.random()*26+1);
		return face;
	}

	// find ramdon client using a random and apply it to seating chart
	public static String findRandomClient(Client[]a){
		String signatureName="";
		int rand=randomGenerator();
		for(Client c : a) {
			if(c.getClientId()==rand) {

				signatureName = c.getSignatureClientString();// if i could make a method that loops thru the array before assigning the actual value and return a boolean look at find RAmdonClient method
			}
		}
		return signatureName;
	}

	public static void setClientSeat(Client[]a, String client, String seatRow,String seatNumber){


		for(Client c : a) {
			if(c.getSignatureClientString().equals(client)) {

					c.setSeatAssignment(seatRow+"-"+seatNumber);
				}
		}

	}

	// Create a method to find whether or not a client is in the seat or not
	// Making a check
	public static boolean findClientInTheRoom(Room[]a,String seat){
		boolean hasSeat = false;

			for(Room c : a) {
				if(c != null) {
					// The getFirstSeat() method is coming from the "Room Class"
					if((!c.getFirstSeat().equals("Empty"))&&(c.getFirstSeat().equals(seat))){
						return true;
					}
					// The getSecondSeat() method is coming from the "Room Class"
					if((!c.getSecondSeat().equals("Empty"))&&(c.getSecondSeat().equals(seat))){
						return true;
					}
					// The getThirdSeat() method is coming from the "Room Class"
					if((!c.getThirdSeat().equals("Empty"))&&(c.getThirdSeat().equals(seat))){
						return true;
					}
					// The getFourthSeat() method is coming from the "Room Class"
					if((!c.getFourthSeat().equals("Empty"))&&(c.getFourthSeat().equals(seat))){
						return true;
					}
					// The getFifthSeat() method is coming from the "Room Class"
					if((!c.getFifthSeat().equals("Empty"))&&(c.getFifthSeat().equals(seat))){
						return true;
					}
					// The getSixthSeat() method is coming from the "Room Class"
					if((!c.getSixthSeat().equals("Empty"))&&(c.getSixthSeat().equals(seat))){
						return true;
					}
					// The getSeventhSeat() method is coming from the "Room Class"
					if((!c.getSeventhSeat().equals("Empty"))&&(c.getSeventhSeat().equals(seat))){
						return true;
					}
					// The getEighthSeat() method is coming from the "Room Class"
					if((!c.getEighthSeat().equals("Empty"))&&(c.getEighthSeat().equals(seat))){
						return true;
					}
					// The getNinthSeat() method is coming from the "Room Class"
					if((!c.getNinthSeat().equals("Empty"))&&(c.getNinthSeat().equals(seat))){
						return true;
					}
					// The getTenthSeat() method is coming from the "Room Class"
					if((!c.getTenthSeat().equals("Empty"))&&(c.getTenthSeat().equals(seat))){
						return true;
					}
				}

		}
		return hasSeat;
	}

	public static void main(String[] args) throws IOException {
		getInput();

	}


}

