package testCasesCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {
	Calculator calculator = new Calculator();
	
	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult = 2 + 3;
		int actualResult = calculator.add(2, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult = 5 - 3;
		int actualResult = calculator.sub(5, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult = 5 * 6;
		int actualResult = calculator.multiply(5, 6);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		float expectedResult = 10 / 2;
		float actualResult = calculator.divide(10, 2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {	
		Exception thrown = assertThrows(
	       ArithmeticException.class,
	       () -> {
	    	   calculator.divide(2, 0);
	       }
		);

		    assertTrue(thrown.getMessage().contains("ZeroDivisionError"));
	}
}
