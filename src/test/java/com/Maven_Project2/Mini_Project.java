package com.Maven_Project2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pom_class.Register_Page;
import com.pom_class.Signin_Page;

public class Mini_Project extends Base_Class {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\surya\\Desktop\\Selenium_Testing\\Selemium_Testing\\driver\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		
//		driver.get("https://phptravels.org/register.php");
//		
		BrowserLaunch("chrome");
		
		Launchurl("https://phptravels.org/login");
		
		driver.manage().window().maximize();
		
//		WebElement signup = driver.findElement(By.xpath("//a[@class='btn btn-outline btn-default']"));
		Signin_Page sp = new Signin_Page(driver);
		
		clickwebelement(sp.getRegisterbutn()); 
		
//		WebElement firstname = driver.findElement(By.id("inputFirstName"));
//	      firstname.sendKeys("surya");
		Register_Page rp = new Register_Page(driver);
		
		passinputvalues(rp.getFirstname() , "surya");
		
//	     WebElement lastname = driver.findElement(By.id("inputLastName"));
//		lastname.sendKeys("varma");
		
		passinputvalues(rp.getLastname(), "varma");
		
//		WebElement email = driver.findElement(By.id("inputEmail"));
//		email.sendKeys("suryavarma5263@gmail.com");
		
		passinputvalues(rp.getEmail(), "suryavarma5263@gmail.com");
		
		WebElement code = driver.findElement(By.id("inputCountry"));
//		Select se = new Select(code); 
//		se.selectByValue("IN");

		selectbyvalue(code, "IN");
		
		WebElement phone = driver.findElement(By.name("phonenumber"));
//		phone.sendKeys("9445914425");
		passinputvalues(phone, "9445914425");
		
		WebElement company = driver.findElement(By.name("companyname"));
//		company.sendKeys("greenger");
		 passinputvalues(company,"greenger" );
		 
		WebElement address = driver.findElement(By.name("address1"));
//		address.sendKeys("chaitanya No.12,khader Nawaz road");
		passinputvalues(address, "chaitanya No.12,khader Nawaz road");
		
		WebElement address2 = driver.findElement(By.name("address2"));
//		address2.sendKeys("Nungambakkam");
		passinputvalues(address2, "Nungambakkam");
		
		WebElement city = driver.findElement(By.id("inputCity"));
//		city.sendKeys("chennai");
		passinputvalues(city, "chennai");
		
		WebElement state = driver.findElement(By.name("state"));
//		state.sendKeys("TamilNadu");
		passinputvalues(state, "TamilNadu");
		
		WebElement postcode = driver.findElement(By.name("postcode"));
//		postcode.sendKeys("600016");
		passinputvalues(postcode, "600016");
		
		WebElement mobile = driver.findElement(By.id("customfield2"));
//		mobile.sendKeys("9445914425");
		passinputvalues(mobile, "9445914425");
		
		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("greenger5263");
		passinputvalues(password,"greenger5263" );
		
		WebElement password2 = driver.findElement(By.id("inputNewPassword2"));
//		password2.sendKeys("greenger5263");
		passinputvalues(password2, "greenger5263");
		
		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
		clickwebelement(click);
	}

}
