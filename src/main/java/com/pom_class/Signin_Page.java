package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Signin_Page {
	
	public WebDriver driver;
	
@FindBy(xpath = "//a[@class='btn btn-outline btn-default']")
	 private WebElement registerbutn;

public Signin_Page(WebDriver driver2) {
	this.driver = driver2; 
	PageFactory.initElements(driver2, this);
}

public WebElement getRegisterbutn() {
	return registerbutn;
}
	
	
	
	
	
	
}
