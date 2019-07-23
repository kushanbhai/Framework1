package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	//this is new commit
	public LoginPage(WebDriver ldriver){
		this.driver = driver;
	}
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath =  "//input[@class='btn btn-small']")
	WebElement loginbtn;
	
	public void logintoCRM(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbtn.click();
	}
}


