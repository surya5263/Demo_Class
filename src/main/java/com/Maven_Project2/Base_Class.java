package com.Maven_Project2;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
public class Base_Class {

	public static WebDriver driver;
	public static WebDriver BrowserLaunch(String name) {
		

			if (name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

				driver = new ChromeDriver();

				driver.manage().window().maximize();
			}
			 else if (name.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

				driver = new ChromeDriver();

				driver.manage().window().maximize();

			}
			return driver;

		}

	public static void Launchurl(String url) {
			driver.get(url);

		}

	public static void quitbrowser() {
			driver.quit();

		}

	public static void closethebrowser() {
			driver.close();
		}

	public static void passinputvalues(WebElement element, String input) {
			element.sendKeys(input);

		}

	public static void clickwebelement(WebElement element) {
			element.click();

		}

	public static void navigate(String url) {
			driver.navigate().to(url);

		}

	public static void navigateback() {
			driver.navigate().back();
		}

	public static void navigateforward() {
			driver.navigate().forward();
		}

	public static void navigaterefresh() {
			driver.navigate().refresh();
		}

	public static void get(String url) {
			driver.get(url);
		}

	public static void alert() {
			driver.switchTo().alert();
		}

	public static void selectbyvalue(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByValue(value);
	                                                                                      
		
	

}
}

