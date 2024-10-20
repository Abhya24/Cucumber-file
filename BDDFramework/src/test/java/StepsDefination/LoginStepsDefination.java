package StepsDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefination {

	WebDriver driver;
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}


	@And("Click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("User should navigate to the home  page")
	public void user_should_navigate_to_the_home_page() {
		String actUrl = "https://www.saucedemo.com/inventory.html";
		String expUrl=driver.getCurrentUrl();
		Assert.assertEquals(actUrl, expUrl);
	}

	@And("Closed the browser")
	public void closed_the_browser() {
	    driver.close();
	}

}
