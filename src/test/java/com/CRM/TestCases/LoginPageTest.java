package com.CRM.TestCases;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test
  public void verifylogin() {
	 lp.Dologin("deepakirthi9999@gmail.com", "deepa9999");
  }
}
