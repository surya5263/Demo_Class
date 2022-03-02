package com.testing_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
@Test
	public void demo_username() {

		String exp_Username = "surya";
		String act_Username = "Surya";
		
		Assert.assertEquals(exp_Username, act_Username);
		
		System.out.println("validation");
		
	}
	
	
}
