package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom_class.Register_Page;
import com.pom_class.Signin_Page;

public class Page_Object_Manager {
public WebDriver driver;
	 
	
	private Signin_Page cp;  
	
	private Register_Page rp;
	
    public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		
		
	}
    public Signin_Page getinstancecp() {
    	if (cp==null) {
			cp= new Signin_Page(driver);
		}
    	
		return cp;

	}
	
    public  Register_Page getinstanceRp() {
    	
    	if (rp==null) {
    	rp= new Register_Page(driver);	
			
		}
		return rp;

	}
	
	
	
	
}
