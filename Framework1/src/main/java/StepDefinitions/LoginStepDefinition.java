package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	DesiredCapabilities capabilities;

	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
	}

	@When("^title of login page is FREE CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO Log In Screen", title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String uid, String pwd) {
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();

	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		String title = driver.getTitle();
		System.out.println("Homepage title is " + title);
		Assert.assertEquals("CRMPRO", title);

	}

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='New Contact']")).click();
	}

	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contacts_details(String firstname, String lastname, String position) throws InterruptedException {
		Thread.sleep(5000);
		//driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//input[@id= 'first_name']")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElement(
				By.xpath("//input[@value='Load From Company']//following::input[@type = 'submit' and @value='Save']"))
				.click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
