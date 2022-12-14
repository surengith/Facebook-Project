package com.Property.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\Surendhar\\eclipse-workspace\\Maven_FaceBook_Project\\src\\main\\java\\com\\Property\\org\\FaceBook.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public static String getBrowser() {

		String browser = p.getProperty("Browser");

		return browser;
	}

	public static String getUrl() {

		String Url = p.getProperty("Url");

		return Url;
	}

	public static String getEmail() {

		String Email = p.getProperty("Email");

		return Email;
	}

	public static String getPassword() {

		String Password = p.getProperty("Password");

		return Password;
	}
}
