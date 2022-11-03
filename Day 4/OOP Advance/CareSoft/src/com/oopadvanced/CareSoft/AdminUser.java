package com.oopadvanced.CareSoft;

import java.util.ArrayList;
import java.util.Date;
public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // Constructor inherited from Parent via super & added extra member variables 
 
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.employeeID = id;
    	this.role = role;
	}
 
    //Implementing HIPAACompliantAdmin Interface abstract methods
    
    
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}

	//Implementing HIPAACompliantUser Interface abstract methods
	@Override
	public boolean assignPin(int pin) {
		String strPin = Integer.toString(pin);
		int pinLen = strPin.length();
		if (pinLen == 6) {
			this.setPin(pin);
			System.out.println("correct!, Pin is 6 digits");
			return true;
		} else {
			System.out.println("Wrong! Pin should be 6 digits!");
			return false;
		}
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		try {
			if (this.getId() == confirmedAuthID) {
				System.out.println("ID is correct");
				this.authIncident();
				return true;
			} else {
				System.out.println("ID is wrong!");
				return false;
			}
		}
		 catch (Exception e) {
			 return false;
		 }
		
	}
	
	//Concrete methods
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.getId(), "AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        securityIncidents.add(report);
    }
	// Getters & Setters 
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
}