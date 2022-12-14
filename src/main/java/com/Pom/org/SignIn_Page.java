package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	public WebDriver driver;

	public SignIn_Page(WebDriver signindriver) {
		this.driver = signindriver;
		PageFactory.initElements(signindriver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginbutton;

}
