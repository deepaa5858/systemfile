package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	private WebDriver driver;

	By signIn = By.linkText("Sign In");

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}


	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	public void signIn()
	{
		driver.findElement(signIn).click();
	}


}
