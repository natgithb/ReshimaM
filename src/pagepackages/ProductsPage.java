package pagepackages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Choose Product from list
	public void chooseProduct(String name) {
		List<WebElement> list= driver.findElements(By.cssSelector(".inventory_item_name"));		
		for(WebElement el : list) {
			if(getText(el).equalsIgnoreCase(name)) {
				//				el.click();
				clickButton(el);
				break; 
			}
		}
	}

	public void addCart(String name) {
		List<WebElement> list= driver.findElements(By.cssSelector(".inventory_item"));
		for(WebElement el: list){
			WebElement titleEl = el.findElement(By.cssSelector(".inventory_item_name"));
			if(getText(titleEl).equalsIgnoreCase(name));
			WebElement addBtn= el.findElement(By.cssSelector(".btn_inventory"));
			clickButton(addBtn);
			break;
		}		
	}

	//Open Cart after back from product page
	public void openCart() {
		//driver.findElement(By.cssSelector("#shopping_cart_container a")).click();
		clickButton(driver.findElement(By.cssSelector("#shopping_cart_container a")));

	}

}






































