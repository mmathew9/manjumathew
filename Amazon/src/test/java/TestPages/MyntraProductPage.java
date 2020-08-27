package TestPages;

import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import TestBase.DriverBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class MyntraProductPage extends DriverBase {

	// page factory design
	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.view.ViewGroup' and @index='3']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement kids_option;

	/*
	 * @CacheLookup
	 * 
	 * @AndroidFindBy(xpath =
	 * "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
	 * 
	 * @WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS) public WebElement
	 * infant_option;
	 */
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='biro_banner|https://www.myntra.com/inf-tki']/android.widget.ImageView")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement infant_option;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement ageOption_12to24M;
	
	@CacheLookup
	@AndroidFindBy(accessibility = "text_filter")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement filter;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='2Y-4Y']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement ageFilter_2to4Y;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Categories']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement filter_Categories;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Clothing Set']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement category_clothingSet;

	@CacheLookup
	@AndroidFindBy(accessibility = "text_apply")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement apply;
	
	@CacheLookup
	@AndroidFindBy(accessibility = "text_department")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement gender;

	@CacheLookup
	@AndroidFindBy(accessibility = "text_department_item 0")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement gender_boy;
	
	@CacheLookup
	@AndroidFindBy(accessibility = "search")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement search_icon;
	
	@CacheLookup
	@AndroidFindBy(accessibility = "search_default_search_text_input")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement search_input;
	
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc='image_image_container'])[1]/android.widget.ImageView")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement select_item;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='ADD TO BAG']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement add_to_bag;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='9M']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement size_9M;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='3M']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement size_3M;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='6M']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement size_6M;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='DONE']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement done;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='GO TO BAG']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement go_to_bag;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @index='2']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement total;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='leftElement']/android.widget.TextView")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement menu;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.ImageView' and @index='0']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement log_in;
	

	@CacheLookup
	@AndroidFindBy(accessibility = "mobile")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement mobile_num;
	
	@CacheLookup
	@AndroidFindBy(accessibility = "form-button")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement mobile_submit;
	
	@CacheLookup
	@AndroidFindBy(accessibility = "password")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement password;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='LOGIN']")
	@WithTimeout(time = 35, chronoUnit = ChronoUnit.SECONDS)
	public WebElement login;
	

}

