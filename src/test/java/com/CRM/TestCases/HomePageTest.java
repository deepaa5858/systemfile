package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass
{
	@Test(priority = 3)
	public void verifyAppUrl()
	{
	 String AppUrl = hp.getAppUrl();
	Assert.assertTrue(AppUrl.contains("crm"), "Url not matched - Testcase Fail");
	System.out.println("Url is matched "+hp.getAppUrl());
	}
	
	@Test(priority = 1)
	public void verifyAppTitle()
	{
	hp.getAppTitle();
	Assert.assertTrue(hp.getAppTitle().contains("Service"), "Title not matched - Testcase Fail");
	System.out.println("Title is matched "+hp.getAppTitle());
	}
	
	@Test(priority = 2)
	public void verifysignIn()
	{
	hp.signIn();
	Assert.assertTrue(hp.getAppUrl().contains("login"), "Url not matched - Testcase Fail" );
	System.out.println("Test pass : LOgin page should open");
	}
}
