package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// All th objects belonging to one page will be defined in java class
public class HomePage {
// 1. Is to call the driver object from testcase to Pageobject file
	
	//Concatenate driver
	public HomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//*[@text='Goal name']")
	public WebElement goalName;
	
	
	@AndroidFindBy(xpath="//*[@text='Description']")
	public WebElement goalDesc;
	
	@AndroidFindBy(xpath="//*[@text='AUTO UPDATE FAILED DAYS.']")
	public WebElement goalDays;
	
	@AndroidFindBy(xpath="//*[@text='SAVE']")
	public WebElement goalSave;
	
	int count=0;
	public void editGoals(String str1, String str2) {
		
		goalName.sendKeys(str1);
		goalDesc.sendKeys(str2);
		
		goalDays.click();
		goalSave.click();
		count++;
		
	}
	
	
	//driver.findElementByXpath("//android.widget.TextView[@text='Preference']");
	
	
	
	
}
