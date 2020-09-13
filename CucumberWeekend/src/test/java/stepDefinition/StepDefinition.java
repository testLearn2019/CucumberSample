package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("Application URL")
	public void application_url() {
	    System.setProperty("webdriver.chrome.driver", "./August_30_Driver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("valid username and password is entered")
	public void valid_username_and_password_is_entered() {
	   driver.findElement(By.id("txtUsername")).sendKeys("admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("Login button is clicked")
	public void login_button_is_clicked() {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("Login success");
	}
	
	@When("invaid username and password is entered")
	public void invaid_username_and_password_is_entered() {
		  driver.findElement(By.id("txtUsername")).sendKeys("ad");
		   driver.findElement(By.id("txtPassword")).sendKeys("admi");
	}
	
	
	
	@When("valid {string} and {string} is entered")
	public void valid_and_is_entered(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		   driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@Then("error message is displayed")
	public void error_message_is_displayed() {
	    System.out.println("Invalid credentials");
	}

}
