package com.CRM.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.*;

public class BaseClass 
{
	WebDriver driver;
	HomePage hp;
	LoginPage lp;

	@BeforeTest
	public void OpeningBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");

		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}  
	@BeforeClass
	public void pagesetUp()

	{
		hp.signIn();
	}



}
