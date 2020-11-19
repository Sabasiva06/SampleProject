package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {
	WebDriver driver;

	@Given("user is on  facebook")
	public void user_is_on_facebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("user is going to enter {string} and {string}")
	public void user_is_going_to_enter_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);

	}
//	@When("user is going to enter username and password")
//	public void user_is_going_to_enter_username_and_password() {
//		driver.findElement(By.id("email")).sendKeys("hiiijava");
//		driver.findElement(By.id("pass")).sendKeys("jagfjaegajf");
//
//	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user should verfiy by seeing the home page")
	public void user_should_verfiy_by_seeing_the_home_page() {
		System.out.println("In valid user name");
	}

}
