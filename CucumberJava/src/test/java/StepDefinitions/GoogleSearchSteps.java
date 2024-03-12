package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Locators.GoogleLocators1;
import io.cucumber.java.en.*;


public class GoogleSearchSteps {
	
	WebDriver driver =null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		//define ChromeDriver path
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:"+ projectPath);
		
	 System.out.println("inside step -browser in open");
	 System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
	 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 
	 //driver.manage().windows().maximize();
	}

	@And("user is on google page")
	public void user_is_on_google_page() {

		 System.out.println("inside step -user is on google search page");
		 
		 driver.navigate().to("https://google.com");
		 driver.findElement(GoogleLocators1.acceptaTot_ByXpath).click();
		 
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
	   
		System.out.println("inside step -user enters a text in search box");
		
		driver.findElement(By.name("q")).sendKeys("Automationstepbysptep");
		
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
	    
		System.out.println("inside step -hits enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   
		Thread.sleep(2000);
	}

	@Then("user navigates to search results")
	public void user_navigates_to_search_results() {
	
		System.out.println("inside step -user navigates to search results");
		
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();

	}


}
