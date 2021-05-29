//package StepDefinitions;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import io.cucumber.java.en.*;
//
//import pages.LoginPage;
//
//public class LoginDemoSteps_POM {
//
//	WebDriver driver = null;
//	LoginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("===I am inside LoginDemoSteps_POM === ");
//		System.out.println("Inside Step - browser is open");
//		
//		String projectPath =  System.getProperty("user.dir");
//		
//		System.setProperty("webdriver.chrome.driver","C:/Users/muham/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
//		
//		//WebDriverManager.chromedriver().setup();
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.google.com/");
//		
//		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//
//	}
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//		
//		driver.navigate().to("https://example.testproject.io/web/");  
//
//	}
//	@When("^user enters(.*)and(.*)$")
//	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
//		login = new LoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
//		Thread.sleep(2000);
//	//	driver.findElement(By.id("name")).sendKeys(username);
//	//	driver.findElement(By.id("password")).sendKeys(password);
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clickLogin();
//	//	driver.findElement(By.id("login")).click();
//	}
//
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		driver.findElement(By.id("logout")).isDisplayed();
//			driver.close();
//		//	driver.quit();
//	}
//}
