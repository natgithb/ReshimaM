package pagepackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	WebDriver driver;

//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}

	// Login Page
	public void login(String user, String password) {
		
		fillText(driver.findElement(By.cssSelector("#user-name")),user);
//		driver.findElement(By.cssSelector("#user-name")).clear();
//		driver.findElement(By.cssSelector("#user-name")).sendKeys(user);
		fillText(driver.findElement(By.cssSelector("#password")),password);
//		driver.findElement(By.cssSelector("#password")).clear();
//		driver.findElement(By.cssSelector("#password")).sendKeys(password);

		clickButton(driver.findElement(By.cssSelector("#login-button")));
//		driver.findElement(By.cssSelector("#login-button")).click();		
	}

}
