package com.learn.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeFeature {

	public static void main(String[] ar) {
//		basicDateTime();
//		basicMonth();
//		basicYear();
//		basicZoneId();
		basicDateTimeComparing();
	}

	private static void basicDateTimeComparing() {
		LocalDateTime dateTime1 = LocalDateTime.now();

		LocalDateTime dateTime2 = LocalDateTime.of(2024, 11, 12, 2, 25);

		System.out.println("Compare for equal: " + dateTime1.compareTo(dateTime2));

		System.out.println("Is After: " + dateTime1.isAfter(dateTime2));
		System.out.println("Is Before: " + dateTime1.isBefore(dateTime2));
		System.out.println("Is Equal: " + dateTime1.isEqual(dateTime2));

	}

	private static void basicZoneId() {

		// 600 Zone ID's
		System.out.println("Total Zone Id's :" + ZoneId.getAvailableZoneIds().stream().count());

		ZoneId.getAvailableZoneIds().forEach((i) -> {
			System.out.println("  " + i + " : " + ZoneId.of(i).getDisplayName(TextStyle.FULL, Locale.US));
		});
	}

	private static void basicYear() {
		Year currentYear = Year.now();
		System.out.println("Current year :" + currentYear);

		YearMonth yearMonth = YearMonth.now();
		System.out.println("Current yearMonth :" + yearMonth);

		YearMonth month = YearMonth.from(yearMonth);
		System.out.println("Temporal :" + month);

		// Error
//		YearMonth month2 = YearMonth.from(currentYear);
//		System.out.println("Temporal :" + month2);

		LocalDate date = month.atDay(4);
		System.out.println("month2.atDay(2) :" + date);

	}

	private static void basicMonth() {

		Month month = Month.APRIL;
		Month month2 = Month.of(2);

		System.out.println("Month.APRIL - " + month);
		System.out.println("Month.of(2) - " + month2);

	}

	private static void basicDateTime() {
		LocalTime localTime = LocalTime.NOON;

		LocalTime time = LocalTime.now();

		LocalDate date = LocalDate.now();

		LocalDateTime dateTime1 = LocalDateTime.now();

		LocalDateTime dateTime2 = LocalDateTime.of(2022, 11, 12, 2, 25);

		LocalDateTime d = LocalDateTime.of(date, localTime);

		System.out.println(localTime);
		System.out.println(time);

		System.out.println(dateTime1);
		System.out.println(dateTime2);

		System.out.println("Date : Time -" + d);

	}

}
