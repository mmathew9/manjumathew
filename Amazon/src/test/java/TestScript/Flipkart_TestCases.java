package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import TestBase.DriverBase;
import TestPageScenario.Login;
import io.appium.java_client.AppiumDriver;

public class Flipkart_TestCases extends DriverBase {
	
	@Test(priority=0)
	public void tc001_login() throws InterruptedException, IOException { // Interacting with login page
		Login lp = new Login((AppiumDriver) driver);
		lp.application_login();
		// Implicit wait till load page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
}