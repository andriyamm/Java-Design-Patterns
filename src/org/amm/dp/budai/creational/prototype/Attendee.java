package org.amm.dp.budai.creational.prototype;

public class Attendee {
	
	public String FirstName;
	public String LastName;
	public String EmailAddress;
	
	public Attendee(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

}