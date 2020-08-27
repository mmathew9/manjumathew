package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import TestBase.DriverBase;
import TestPageScenario.HomePage_cartOperation;
import TestPageScenario.LoginPage_login;
import TestPages.HomePage;
import TestPages.LoginPage;
import io.appium.java_client.AppiumDriver;

public class Amazon_TestCases extends DriverBase {
	
	
	 @Test(priority=0) public void tc001_Login_negativeTC() throws InterruptedException, IOException { // Interacting with login page
	 LoginPage_login lp = new LoginPage_login((AppiumDriver) driver);
	 lp.login_negativeTC(); // Implicit wait till load page
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  }
	 
	 	
}