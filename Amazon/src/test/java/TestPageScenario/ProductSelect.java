package TestPageScenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.DriverBase;
import TestPages.LoginPage;
import TestPages.MyntraProductPage;
import general.KeywordFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ProductSelect extends DriverBase {
	protected Logger log = Logger.getLogger(LoginPage.class.getName());
	protected KeywordFunctions keys = new KeywordFunctions(driver);
	public MyntraProductPage productpage = new MyntraProductPage();
	WebDriverWait wait;
	public Properties obj;
	public FileInputStream objfile;
	public String mobile_number, mypassword;
	TouchAction touch = new TouchAction(driver);

	// page factory initialization
	
	  public ProductSelect(AppiumDriver driver) {
	  
	  PageFactory.initElements(new AppiumFieldDecorator(driver), productpage);
	  log.info(getClass()); 
	  log.info("Loginpage elements initialized"); 
	  
	  }
	  
	  public void login() throws InterruptedException, IOException {
		     wait = new WebDriverWait(driver, 30);
		     obj = new Properties(); 
		     log.info(getClass());
		     System.out.println(System.getProperty("user.dir")); 
		     objfile = new FileInputStream(System.getProperty("user.dir") + "/util/testdata.properties"); 
		     obj.load(objfile);
		  
		     mobile_number = obj.getProperty("mobile_number"); 
		     mypassword =  obj.getProperty("mypassword"); 
		     System.out.println(mobile_number);
		     System.out.println(mypassword);
			
			System.out.println("Inside login()");
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.menu)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.log_in)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.mobile_num)));
			keys.sendSetText(wait.until(ExpectedConditions.visibilityOf(productpage.mobile_num)), mobile_number);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.mobile_submit)));
			Thread.sleep(5000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.password)));
			keys.sendSetText(wait.until(ExpectedConditions.visibilityOf(productpage.password)), mypassword);
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.login)));
			System.out.println("Complete login()");
		}
	 

	public void kidsSelect() throws InterruptedException, IOException {

			wait = new WebDriverWait(driver, 30);
			System.out.println("Inside kidsSelect()");
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.kids_option)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.infant_option)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.filter)));
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.ageFilter_2to4Y)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.filter_Categories)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.category_clothingSet)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.apply)));
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.gender)));
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.gender_boy)));
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.search_icon)));
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.search_input)));
			keys.sendSetText(wait.until(ExpectedConditions.visibilityOf(productpage.search_input)), "Chicco");
			((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
			Thread.sleep(1000);
			//TouchAction touch = new TouchAction(driver);
			Dimension size = driver.manage().window().getSize();
			int height = size.getHeight();
			int width = size.getWidth();
			int x = width/2;
			int starty = (int)(height*0.80);
			int endy = (int)(height*0.20);
			System.out.println("height="+height);
			System.out.println("width="+width);
			System.out.println("starty="+starty);
			System.out.println("endy="+endy);
			touch.press(PointOption.point(x, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(x, endy)).release().perform();
			Thread.sleep(5000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.select_item))); 
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.add_to_bag))); 
			Thread.sleep(1000);
			if(wait.until(ExpectedConditions.visibilityOf(productpage.size_9M)).isEnabled()) { 
				keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.size_9M)));
				Thread.sleep(1000);
			 } 
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.done))); 
			Thread.sleep(1000);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(productpage.go_to_bag)));
			Thread.sleep(1000);
			System.out.println("Complete kidsSelect()");
		
		}
	
}
