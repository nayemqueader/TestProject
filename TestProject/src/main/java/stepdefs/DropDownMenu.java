package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDownMenu {
	
//WebDriver driver;
@Test
public void dropdownmenu() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(); // create object
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // implicit wait browser and url we use for syncronization purpose 
	  // we use both for syncronization purpose and in betwwen browser and url. 
	  // sometimes we may  get webdriver exception/exception if dont use wait. sometimes it might happen that after opening a browser if we dont use any wait it may not open url and through an exception.
	  // webdriver exception for we use wait after that it will gives time out exception.
	  driver.get("http://mrbool.com/");
	  
	  Actions action =new Actions(driver);
	  action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	 driver.findElement(By.xpath("")).click();
	  
	  
	  
}
}