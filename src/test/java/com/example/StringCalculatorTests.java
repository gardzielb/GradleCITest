package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTests {
	@Test
	public void sum_ShouldReturnSum_ForTwoNumbersCommaSeparated() {
		var calculator = new StringCalculator();
		int result = calculator.sum( "3,4" );
		Assertions.assertEquals( 3 + 4, result );
	}
}
