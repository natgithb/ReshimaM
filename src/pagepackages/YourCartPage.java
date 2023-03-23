package pagepackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends BasePage{
	

public YourCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	WebDriver driver;
//
//	public YourCartPage(WebDriver driver) {
//		this.driver = driver;
//	}

	public void checkOut() {
//		driver.findElement(By.cssSelector("#checkout")).click();
		clickButton(driver.findElement(By.cssSelector("#checkout")));
	}

}
