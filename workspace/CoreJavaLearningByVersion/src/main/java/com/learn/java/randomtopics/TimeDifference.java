package com.learn.java.randomtopics;

import java.security.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class TimeDifference {

	public static void findHoursDifference() {

		Instant timestamp1 = Instant.parse("2023-04-09T12:00:00Z");
		Instant timestamp2 = Instant.parse("2023-04-09T14 :00:00Z");

		Duration duration = Duration.between(timestamp1, timestamp2);
		System.out.println(duration.toHours() + " seconds");

	}
	
	
	public static void findHours() {
	
		LocalDateTime timestamp1 = LocalDateTime.parse(null);
		LocalDateTime timestamp2 = LocalDateTime.parse(null);
		
		long diffMilliseconds = timestamp2.getHour() - timestamp1.getHour(); // get the difference in milliseconds
		long diffHours = diffMilliseconds / (60 * 60 * 1000); // convert to hours

		System.out.println("The difference between the timestamps is " + diffHours + " hours.");

	}
	
	public static void main(String[] args) {
		findHoursDifference();
	}
	
}
