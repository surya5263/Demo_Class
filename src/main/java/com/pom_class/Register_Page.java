package com.pom_class;

import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
 public  WebDriver driver ;
	@FindBy(id="inputFirstName")
	 private WebElement firstname;
	
   @FindBy(id="inputLastName")
	 private WebElement lastname;
	
	@FindBy(id="inputEmail")
	 private WebElement email;
	
	
	 public Register_Page(WebDriver driver3) {
		 this.driver = driver3;
		 PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getEmail() {
			return email;
		}
	
	
	
	
}
