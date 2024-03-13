package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;

	By acceptaTot_ByXpath = By
			.xpath("//div[contains(@class,'QS5gu sy4vM') and normalize-space(text())='Acceptă tot' ]");
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_submit = By.id("submit");
	By btn_logOut = By.xpath("//*[contains(text(), 'Log out')]");

	public loginPage(WebDriver driver) {

		// driver = driver;
	}

	// create separate function for every action on the page
	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(btn_submit).click();

	}

	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_submit).click();
	}

}

//  CTRL+SHIFT+F - code auto formatting