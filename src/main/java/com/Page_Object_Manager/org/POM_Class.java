package com.Page_Object_Manager.org;

import org.openqa.selenium.WebDriver;

import com.Pom.org.SignIn_Page;

public class POM_Class {
	
	public WebDriver driver;
	
	public POM_Class(WebDriver pomdriver) {
		this.driver = pomdriver;
	}

	private SignIn_Page signin;
	
	public SignIn_Page getSignin() {
		
		signin = new SignIn_Page(driver);
		
		return signin;
	}
	

}
