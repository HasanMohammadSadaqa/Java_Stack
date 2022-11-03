package com.oopadvanced.CareSoft;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// Invoking super constructor from Parent(User)
	public Physician(Integer myId) {
		super(myId);
		this.patientNotes= new ArrayList<String>();
	}
	
	//Interface methods implementation
	@Override
	public boolean assignPin(int pin) {
		String strPin = Integer.toString(pin);
		int pinLen = strPin.length();
		if (pinLen == 4) {
			this.setPin(pinLen);
			System.out.println("Pin is 4 digits");
			return true;
		} else {
			System.out.println("Pin should be 4 digits!");
			return false;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.getId() == confirmedAuthID) {
			System.out.println("ID is correct");
			return true;
		} else {
			System.out.println("ID is wrong!");
			return false;
		}
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s\n", this.getId());
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}
	//Getters & Setters 
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}
