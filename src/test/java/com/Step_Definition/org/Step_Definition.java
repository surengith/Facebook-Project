package com.Step_Definition.org;

import org.openqa.selenium.WebDriver;
import com.Base_Class.org.Base_Class;
import com.Page_Object_Manager.org.POM_Class;
import com.Property.org.File_Reader_Manager;
import com.Test_Runner.org.Test_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;

	public static POM_Class pom = new POM_Class(driver);

	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
	}

	@When("user Enter The {string} In The Email Field")
	public void user_enter_the_in_the_email_field(String username) {
		passInput(pom.getSignin().getEmail(), username);
	}

	@When("user Enter The {string} In The Password Field")
	public void user_enter_the_in_the_password_field(String password) {
		passInput(pom.getSignin().getPassword(), password);
	}

	@When("^user Click The Login Button To Login$")
	public void user_Click_The_Login_Button_To_Login() throws Throwable {
		clickOnElement(pom.getSignin().getLoginbutton());
	}

	@Then("^user Take Screenshot$")
	public void user_Take_Screenshot() throws Throwable {
		screenshot("facebook");
		wait(3000);
	}

}
