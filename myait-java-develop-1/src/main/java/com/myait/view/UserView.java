package com.myait.view;

public class UserView {
	
	private String firstName;
	private String lastName;
	private String designation;
	private String aitEmail;
	private long contactNumber;
	
	public UserView() {
	
	}

	public UserView(String firstName, String lastName, String designation, String aitEmail, long contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.aitEmail = aitEmail;
		this.contactNumber = contactNumber;
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAitEmail() {
		return aitEmail;
	}

	public void setAitEmail(String aitEmail) {
		this.aitEmail = aitEmail;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "UserView [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation
				+ ", aitEmail=" + aitEmail + ", contactNumber=" + contactNumber + "]";
	}
	

	

}