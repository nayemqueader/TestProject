package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoninSD {
WebDriver driver;

@Given("^user visiting homepage$")
public void user_visiting_homepage() throws Throwable {
  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver(); // create object
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // implicit wait
  driver.get("https://demo.oscommerce.com/");
  WebDriverWait wait = new WebDriverWait(driver,10); // object explicit wait
  driver.findElement(By.xpath("//*[@id=\"tdb3\"]/span[2]")).click();
  
  driver.findElement(By.name("email_address")).sendKeys("pat@yahoo.com");
  driver.findElement(By.name("password")).sendKeys("Abc123");
  driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
  WebDriverWait wait1 = new WebDriverWait(driver,10); // object explicit wait
  Thread.sleep(5000); // Millisecond
  driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span")).click();
  
}

@Given("^click My Account button$")
public void click_My_Account_button() throws Throwable {
	 
	 WebDriverWait wait2 = new WebDriverWait(driver,10); // object explicit wait
			 
}

@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2) throws Throwable {

	
}

@When("^user clickn sign in button$")
public void user_clickn_sign_in_button() throws Throwable {
 
}

@Then("^user successfully login to the system$")
public void user_successfully_login_to_the_system() throws Throwable {
    
}

@Then("^user click on Log off Button for logout$")
public void user_click_on_Log_off_Button_for_logout() throws Throwable {
   
}
}
