package com.testing_features;

import org.testng.annotations.Test;

public class Priority_Testing {
	@Test(priority = -1)
	private void men() {
		System.out.println("men");
	}

	@Test
	private void women() {
		System.out.println("women");
	}

	@Test(priority =3 ,invocationCount =4 )
	private void kids() {
		System.out.println("kids");
		
}
} 