package com.testing_features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
@Test
@Parameters({"name","age","gender","surname","qualification"})
	private void personal_details(String name,int age ,String gender,String surname,String qualification) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Surname:"+surname);
		System.out.println("Qualification:"+qualification);
	}

}
