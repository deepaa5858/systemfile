package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;

	}

	By id = By.id("email-id");
	By xpath = By.xpath("//*[@id=\"password\"]");
	By Xpath = By.xpath("//*[@id=\"submit-id\"]");
	
	
	public void Dologin(String un, String ps)
	{
		driver.findElement(id).sendKeys(un);
		driver.findElement(xpath).sendKeys(ps);
		driver.findElement(Xpath).click();
	}
	



}
