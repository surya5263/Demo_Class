package com.testing_features;

import org.testng.annotations.Test;

public class Groupof_Ofgroups {
	
	@Test(groups="fruits")
	public void apple() {
		System.out.println("apple");
	}

	@Test(groups ="fruits")
	public void orange() {
		System.out.println("orange");
	}

	@Test(groups="fruits")
	public void grapes() {
		System.out.println("grapes");
	}

	@Test(groups= "electronics")
	public void tablet() {
		System.out.println("tablet");
	}

	@Test(groups= "electronics")
	public void laptop() {
		System.out.println("laptop");
	}

	@Test(groups="electronics")
	public void computer() {
		System.out.println("computer");
	}

	@Test(groups ="mobile")
	public void vivo() {
System.out.println("vivo");
	}
	
	@Test(groups ="mobile")
	public void blackberry() {
System.out.println("blackberry");
	}
	
	@Test(groups ="mobile")
	public void samsung() {
System.out.println("samsung");
	}
	
	@Test(groups ="mobile")
	public void oppo() {
System.out.println("oppo");
	}
	
	
}

	
	
	
