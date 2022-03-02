package com.testing_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concepts {
	@Ignore
	@Test
	public void zucchini() {
		System.out.println(" zucchini");
	}

   @Test
	public void iceberg() {
		System.out.println("iceberg");
	}

	@Test(enabled = false)
	public void lettuce() {
		System.out.println("lettuce");
	}

	@Test
	public void cabbage() {
		System.out.println("cabbage");
	}

}
