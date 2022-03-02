package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\surya\\Desktop\\Selenium_Testing\\Maven_Project2\\src\\main\\java\\com\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String geturl() throws IOException {

		String url = p.getProperty("url");

		return url;

	}

	public String getfirstname() throws Exception {

		String firstname = p.getProperty("firstname");

		return firstname;
	}

	public String getlastname() throws IOException {

		String firstname = p.getProperty("lastname");

		return firstname;

	}

	public String getemail() throws IOException {

		String email = p.getProperty("email");

		return email;

	}

}
