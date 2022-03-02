package com.Maven_Project2;

import org.openqa.selenium.WebDriver;

import com.properties.File_Reader_Manager; 
import com.sdp.Page_Object_Manager;

public class Task_3 extends Base_Class {

	public static WebDriver driver = BrowserLaunch("chrome");
	
	public static  Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Exception {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		
		Launchurl(url);
		
		clickwebelement(pom.getinstancecp().getRegisterbutn());
		
		Thread.sleep(2000);
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstname();
		passinputvalues(pom.getinstanceRp().getFirstname(),firstname);
		
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlastname();
		passinputvalues(pom.getinstanceRp().getLastname(),lastname);
		
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getemail();
		passinputvalues(pom.getinstanceRp().getEmail(),email);
		
	}
	
}
