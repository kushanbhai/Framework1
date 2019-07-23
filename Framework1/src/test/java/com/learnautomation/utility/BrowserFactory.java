package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browsername, String appurl) {
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"./Drivers1/chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			System.out.println("We dont support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
