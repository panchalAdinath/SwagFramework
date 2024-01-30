package com.SwagLabs.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvetoryPage 
{
	private WebDriver driver;
	
	public InvetoryPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	private By product = By.id("//div[normalize-space()='Sauce Labs Backpack']");
	private By addToCartBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By showCartBtn = By.xpath("//a[@class='shopping_cart_link']");
	private By GetSummary = By.xpath("//div[@class='cart_item_label']");
	
	
//	Actions
	public void addProductToCart()
	{
		driver.findElement(product).click();
		driver.findElement(addToCartBtn).click();
		driver.findElement(showCartBtn).click();
		
		String summary = driver.findElement(GetSummary).getText();
		System.out.println(summary);
	}
}
