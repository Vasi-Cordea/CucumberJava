package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	 public static By acceptaTot_ByXpath = By.xpath("//div[contains(@class,'QS5gu sy4vM') and normalize-space(text())='Acceptă tot' ]");
	 public static By txt_username = By.id("username");
	 public static By txt_password = By.id("password");
	 public static By btn_submit=By.id("submit");
	public static By btn_logOut =  By.xpath("//*[contains(text(), 'Log out')]");
	 
	public loginPage(WebDriver driver) {
		
		driver =driver;
	}
	
	 
	 public void enterUsername (String username) {
		 
		 driver.findElement(txt_username).sendKeys(username);
		 
		  }
	 
 public void enterPassword (String password) {
		 
		 driver.findElement(txt_password).sendKeys(password);
}
 public void clickLogin () {
	 
	 driver.findElement(btn_submit).click();
 
}
 public void loginValidUser(String username, String password) {
	 driver.findElement(txt_username).sendKeys(username);
	 driver.findElement(txt_password).sendKeys(password);
	 driver.findElement(btn_submit).click();
 }
 
 }