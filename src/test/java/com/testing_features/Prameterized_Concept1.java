package com.testing_features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameterized_Concept1 {
	@Test
	@Parameters({"name1","age","yearofpassing","cgpa","email"})
	private void resume(@Optional("suryavarma")String name1, int age, int yearofpassing, int cgpa, String email) {
		System.out.println("name:"+name1);
		System.out.println("age:"+age);
		System.out.println("yearofpassing:"+yearofpassing);
		System.out.println("cgpa:"+cgpa);
		System.out.println("email:"+email);

	}

}
