package com.example;

public class StringCalculator {
	public int sum( String input ) {
		var splitInput = input.split( "," );
		return Integer.parseInt( splitInput[0] ) + Integer.parseInt( splitInput[1] );
	}
}
