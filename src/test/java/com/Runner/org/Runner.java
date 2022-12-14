package com.Runner.org;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base_Class.org.Base_Class;
import com.Page_Object_Manager.org.POM_Class;
import com.Pom.org.SignIn_Page;
import com.Property.org.File_Reader_Manager;

public class Runner extends Base_Class {

	public static WebDriver driver = launchBrowser("Chrome");
	public static POM_Class pom = new POM_Class(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		launchBrowser("Chrome");

//		driver.get("https://www.facebook.com/");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);

//		SignIn_Page signin = new SignIn_Page(driver);

//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("abc@gmail.com");
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
		passInput(pom.getSignin().getEmail(), email);

//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("123456");
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getSignin().getPassword(), password);

//		WebElement loginbutton = driver.findElement(By.name("login"));
//		loginbutton.click();
		clickOnElement(pom.getSignin().getLoginbutton());

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("Screenshot" + "\\fb.png");
//		FileUtils.copyFile(source, destination);
		screenshot("facebook");

//		Thread.sleep(3000);
		wait(3000);
//		driver.close();
		closeBrowser();
	}

}
