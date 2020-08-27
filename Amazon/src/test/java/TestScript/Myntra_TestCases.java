package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.DriverBase;
import TestPageScenario.ProductSelect;
import io.appium.java_client.AppiumDriver;

public class Myntra_TestCases extends DriverBase {
	
	  @Test(priority=0) 
	  public void tc001_Login() throws InterruptedException, IOException { // Interacting with login page 
	  ProductSelect ps = new ProductSelect((AppiumDriver) driver); 
	  ps.login(); 
	  }
	 
	 
	
	@Test(priority=1)
	public void tc002_ChooseProduct() throws InterruptedException, IOException { // Interacting with product page
		ProductSelect ps = new ProductSelect((AppiumDriver) driver);
		ps.kidsSelect();
	}
	
	
}