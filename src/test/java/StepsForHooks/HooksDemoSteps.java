package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HooksDemoSteps {

	WebDriver driver = null;

	@Before(value = "@smoke", order =  1)
	public void browserSetUp() {
		System.out.println("I am inside browserSetup");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");	
		driver = new ChromeDriver();	
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}@Before(order =0)
	public void setup2() {
		System.out.println("  I am inside setup2 \n");
	}


	@After(order = 1)
	public void tearDown() {
		System.out.println("I am inside tearDown");
		

	}@After(order=2)
	public void tearDown2() {
		System.out.println("I am inside tearDown2 \n");


	}


	@BeforeStep
	public void beforeSteps() {

		System.out.println(" I am inside beforeSteps ---");
	}
	@AfterStep
	public void aftereSteps() {

		System.out.println(" I am inside afterSteps ---");

	}
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigatd to the home page")
	public void user_is_navigatd_to_the_home_page() {

	}

}
