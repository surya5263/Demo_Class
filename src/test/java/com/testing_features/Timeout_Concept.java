package com.testing_features;

import org.testng.annotations.Test;

public class Timeout_Concept {
	@Test(timeOut = 70000)
	private void login() throws Exception {
		Thread.sleep(2000);
		System.out.println("browserlaunch");
		Thread.sleep(2000);
		System.out.println("url launch");
		Thread.sleep(2000);
		System.out.println("signup");

	}

}
