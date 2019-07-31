// Client Object

public class Client {
    // Client Object Fields
	private String seatAssignment;
    private String lastname;
    private String firstname;
    private int id;

    // Client Constructor
    Client(String s, String l, String f, int i) {
    	this.seatAssignment = s;
        this.lastname = l;
        this.firstname = f;
        this.id = i;
    }

    // Create a get method to return "Client's ID"
    int getClientId() {
        return id;
    }

    // Create a get method to return "Client's Last Name"
    String getClientLastName() {
        return lastname;
    }

    // Create a get method to return "Client's First Name"
    String getClientFirstName() {
        return firstname;
    }
    
    // Create a get method to return "Client's Seat Assignment"
    public String getSeatAssignment() {
    	return seatAssignment;
    }
    
    // Create a set method for "Client's Seat Assignment"
    public void setSeatAssignment(String seatAssignment) {
    	this.seatAssignment = seatAssignment;
    }
    
    // Create a get method to return "Client's Full String"
    String getFullClientString() {
        String full = ("id: " + id + " lastname: " + lastname + " firstname: " + firstname);
        return full;
    }
    
    // Create a get method to return "Client's Initials"
    String getClientInitials() {
        char[] initialsArr = {' ', ' '};
        initialsArr[0] = firstname.charAt(0);
        initialsArr[1] = lastname.charAt(0);
        return new String(initialsArr);
    }
    
    // Create a get method to return "Clients ID and Initials"
    String getSignatureClientString() {
    	String signatureString = ("Id: " + id + "/" + getClientInitials());
    	return signatureString;
    }
    
    // Create a get method to return "Client's seat assignment"
    String getSeatingAssignment() {
    	String seatingAssignment = ("Client" + "Id" + "Seat \n" + firstname + " " + lastname + " " + id + " " + seatAssignment);
    	return seatingAssignment;
    }

}