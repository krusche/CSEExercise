package de.tum.in.ase.cse.exercise.model;

import java.util.Date;

public class Trip {
	
	private Date startDate;
	private String destination;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Trip(Date startDate, String destination) {
		this.setStartDate(startDate);
	}
}
