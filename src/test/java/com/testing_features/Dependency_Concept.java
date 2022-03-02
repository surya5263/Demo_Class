package com.testing_features;

import org.testng.annotations.Test;

public class Dependency_Concept {
	
	@Test
	public void first() {
		System.out.println("first");
	}

	@Test(dependsOnMethods = "first")
	public void second() {
		System.out.println("second");

	}

}
