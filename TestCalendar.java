package testCasesCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

public class TestCalendar {
	@ParameterizedTest
	@ValueSource(ints = { 1904, 1908, 1912, 1916, 1920 })
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		Calendar calendar = new Calendar(year);

		assertTrue(calendar.isLeapYear());
	}

// Implement test cases for the equivalent partitions 
	
	@ParameterizedTest
	@ValueSource(ints = {19, 1902, 1912, 1980, 1999, 2001})
	public void should_check_if_year_in_20th_century(int year) {
		Calendar calendar = new Calendar(year);
		
		assertTrue(calendar.isValidInput());
	}
}
