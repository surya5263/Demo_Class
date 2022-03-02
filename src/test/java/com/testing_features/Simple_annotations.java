package com.testing_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotations {
	@BeforeSuite
	private void propertysetup() {
		System.out.println(" propertysetup");
	}

	@BeforeClass
	private void browserlaunch() {
		System.out.println("browserlaunch");
	}

	@BeforeTest
	private void launchurl() {
		System.out.println("launchurl");
	}

	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}

	@Test
	private void men() {
		System.out.println("men");
	}

	@Test
	private void women() {
		System.out.println("women");
	}

	@Test
	private void kids() {
		System.out.println("kids");
	}

	@AfterMethod
	private void signout() {
		System.out.println("signout");

	}

	@AfterTest
	private void homepage() {
System.out.println("homepage");
	}
	
	@AfterClass
	private void deletecookies() {
System.out.println("deletecookies");
	}
	
	@AfterSuite
private void quitbrowser() {
System.out.println("quitbrowser");
}
	
	
}
