package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.NaptolHomePage;

public class LoginTest extends BaseTest {
	
	@BeforeMethod
	public void openApplication() {
		 driver = Browser.launchBrowser();
	}
	
	@Test
	public void verifyUserIsAbleTologin() {
		NaptolHomePage naptolHomePage = new NaptolHomePage(driver);
		naptolHomePage.clickOnLogin ();
		naptolHomePage.isLoginPopupDisplayed();
	}
		
	
				
				
				
				
				
	}


