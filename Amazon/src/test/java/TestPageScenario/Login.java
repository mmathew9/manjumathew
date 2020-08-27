package TestPageScenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.DriverBase;
import TestPages.LoginPage;
import general.KeywordFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends DriverBase {
	protected Logger log = Logger.getLogger(LoginPage.class.getName());
	protected KeywordFunctions keys = new KeywordFunctions(driver);
	public LoginPage loginpage = new LoginPage();
	public Properties obj;
	public FileInputStream objfile;
	public String username, invalid_username, password, invalid_password, search_content;
	WebDriverWait wait;

	// page factory initialization
	
	  public Login(AppiumDriver driver) {
	  
	  PageFactory.initElements(new AppiumFieldDecorator(driver), loginpage);
	  log.info(getClass()); log.info("Loginpage elements initialized"); }
	 

	public void application_login() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Inside application_login()");
		Thread.sleep(1000);
		keys.clickElement(driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='English']"));
		keys.clickElement(driver.findElementByXPath("//*[@class='android.widget.Button' and @text='CONTINUE']"));
		keys.clickElement(driver.findElementByXPath("//*[@resource-id='com.google.android.gms:id/credential_primary_label' and @text='097423 86341']"));
		Thread.sleep(1000);
		keys.clickElement(driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/phone_input']"));
		keys.clickElement(driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/button' and @text='Send OTP']"));
		Thread.sleep(1000);
		keys.clickElement(driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/search_widget_textbox']"));
		Thread.sleep(1000);
		keys.sendSetText(driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/search_autoCompleteTextView']"), "Mobiles");
		keys.clickElement(driver.findElementByXPath("//*[@class='android.widget.RelativeLayout' and @index='0']"));
		keys.clickElement(driver.findElementByXPath("//*[@resource-id='com.flipkart.android:id/allow_button']"));
		keys.clickElement(driver.findElementByXPath("//*[@resource-id='com.android.packageinstaller:id/permission_deny_button']"));
	
	}

}
