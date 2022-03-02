package com.testing_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void login1() {

		String exp = "123";
		String act = "123";
		Assert.assertEquals(exp, exp);

	}
@Test(retryAnalyzer= Rerun.class)
	public  void login2() {
		String exp = "abc";
		String act = "abu";
		Assert.assertEquals(exp, act);

	}

}
