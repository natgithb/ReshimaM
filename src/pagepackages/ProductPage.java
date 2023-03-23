package pagepackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
	
	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// Adding product to card by clicking on relevant button
	public void addToCart() {
//	driver.findElement(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory")).click();
	clickButton(driver.findElement(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory")));	
	}
	
	public void back() {
//	driver.findElement(By.cssSelector("#back-to-products")).click();
	clickButton(driver.findElement(By.cssSelector("#back-to-products")));
	}	
}
