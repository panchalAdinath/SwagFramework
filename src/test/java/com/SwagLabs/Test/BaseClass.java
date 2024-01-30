package com.SwagLabs.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public InvetoryPage ip;
	
	
	//browser setup
	@BeforeTest
	public void browserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		lp = new LoginPage(driver);
		ip = new InvetoryPage(driver);
	}
	
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin("standard_user", "secret_sauce");
	}
}
