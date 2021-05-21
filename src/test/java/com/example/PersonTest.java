package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
	@Test
	public void toString_ShouldReturnAllPersonData() {
		String name = "Gandalf";
		String surname = "The Gray";
		int age = Integer.MAX_VALUE;
		var person = new Person( name, surname, age );

		String personStr = person.toString();
		Assertions.assertTrue( personStr.contains( name ) );
		Assertions.assertTrue( personStr.contains( surname ) );
		Assertions.assertTrue( personStr.contains( Integer.toString( age ) ) );
	}
}
