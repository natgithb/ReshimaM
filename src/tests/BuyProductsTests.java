package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagepackages.LoginPage;
import pagepackages.ProductPage;
import pagepackages.ProductsPage;
import pagepackages.YourCartPage;

public class BuyProductsTests {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");


		LoginPage pl= new LoginPage(driver);
		pl.login("standard_user","secret_sauce");
		Thread.sleep(2000);

		ProductsPage psp= new ProductsPage(driver);
		psp.chooseProduct("Sauce Labs Fleece Jacket");
		Thread.sleep(1000);

		ProductPage pp= new ProductPage(driver);
		pp.addToCart();
		pp.back();

		psp= new ProductsPage(driver);
		psp.chooseProduct("Sauce Labs Bike Light");
		Thread.sleep(1000);

		pp= new ProductPage(driver);
		pp.addToCart();
		pp.back();

		psp= new ProductsPage(driver);
		psp.openCart();

		YourCartPage ycp= new YourCartPage(driver);
		ycp.checkOut();		
	}

}
