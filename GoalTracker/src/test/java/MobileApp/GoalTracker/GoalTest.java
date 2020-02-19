package MobileApp.GoalTracker;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import resources.Base;
import resources.HomePage;

 
 
  

public class GoalTest extends Base{

@Test()
public void inputGoals() throws IOException, InterruptedException
{
		
	service=startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("goal");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
 
     HomePage h=new HomePage(driver);
     
     h.editGoals("Exercise", "Core-Planks");
     driver.findElement(By.id("info.intrasoft.habitgoaltracker:id/fab")).click();
     driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
 		
     h.editGoals("LearningMusic", "Flute");
      
   
     service.stop();
  
     
     
	}

@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
  


}


