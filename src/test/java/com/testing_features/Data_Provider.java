package com.testing_features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider="inputdata1")
	public void credentials(String username, String password) {

		System.out.println("username:" + username);

		System.out.println("password:" + password);
	}

	@DataProvider
	private Object[][] inputdata() {
		
    return new Object [][] {
    	
    	{"surya","123"},
    	{"varma","567"},
    	{"raja","890"}
    };
	  
	}
	
	
	@DataProvider
	private Object[][] inputdata1() {
		
    return new Object [][] {
    	
    	{"amazon","123"},
    	{"flipkart","567"},
    	{"hotstar","890"}
    };
	
	}
	
}
	
	

