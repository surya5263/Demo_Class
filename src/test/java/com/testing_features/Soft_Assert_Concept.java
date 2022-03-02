package com.testing_features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
@Test
	private void demo_password() {

		String exp_password = "123";
		String act_password= "123";
		
		SoftAssert s = new SoftAssert();
		s.assertNotEquals(exp_password,act_password);
				
		System.out.println("verification");
	}
	
	
	
	
	
	
	
	
}
