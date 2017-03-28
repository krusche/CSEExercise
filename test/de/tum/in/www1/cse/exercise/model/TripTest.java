package de.tum.in.www1.cse.exercise.model;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class TripTest {

	@Test
	public void testConstructorDestination() {
		String destination = "Munich";
		Date startDate = new Date();
		
		Trip trip = new Trip(startDate, destination);
		assertEquals(destination, trip.getDestination());
	}

	@Test
	public void testConstructorDate() {
		String destination = "Munich";
		Date startDate = new Date();
		
		Trip trip = new Trip(startDate, destination);
		assertEquals(trip.getStartDate(), startDate);
	}

}
