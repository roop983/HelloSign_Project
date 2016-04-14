package com.org.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.objectRepository.page_properties;

public class Test1 {
	
	public WebDriver driver;
	public WebDriverWait wait;
	String actual_error_message=null;
	
	@BeforeMethod
	 public void initialize()
	 {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe"); 
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		//Launch the browser
		driver.get(page_properties.url);
		driver.manage().window().maximize();  
		//Put a Implicit wait, this means that any search for elements on the page could take the time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,20);
	 }
	
	@AfterMethod
	 public void teardown() throws Exception
	 {
		Thread.sleep(5000);
		// Close the driver
		 driver.quit();
	 }
	
	@Test(priority=1)
	
	public void FirstTest()
	{
		try{
			page_properties.Log_In(driver).click();
			page_properties.Email(driver).sendKeys(page_properties.email_address1);
			page_properties.Password(driver).sendKeys(page_properties.passwrd1);
			page_properties.Sign_In(driver).click();
			
			actual_error_message=page_properties.Error_Message(driver).getText();
			System.out.println("Error message shown is: "+actual_error_message);
			
			if((page_properties.expected_error_message1).equalsIgnoreCase(actual_error_message))
			{
				System.out.println("Validation of message is successful");
				Reporter.log("Validation successful, Error message recived: "+actual_error_message);
			}
			else
			{
				System.out.println("Validation of message is unsuccessful");
				Reporter.log("Validation usuccessful, No Error message recived");
			}
			
			}
		catch(Exception e){
			System.out.println("Problem in Login");						
		}
		
	}
	
	
@Test(priority=2)
	
	public void SecondTest()
	{
		try{
			page_properties.Log_In(driver).click();
			page_properties.Email(driver).sendKeys(page_properties.email_address2);
			page_properties.Password(driver).sendKeys(page_properties.passwrd2);
			page_properties.Sign_In(driver).click();
			
			actual_error_message=page_properties.Error_Message(driver).getText();
			System.out.println("Error message shown is: "+actual_error_message);
			
			if((page_properties.expected_error_message2).equalsIgnoreCase(actual_error_message))
			{
				System.out.println("Validation of message is successful");
				Reporter.log("Validation successful, Error message recived: "+actual_error_message);
			}
			else
			{
				System.out.println("Validation of message is unsuccessful");
				Reporter.log("Validation usuccessful, No Error message recived");
			}
			
			}
		catch(Exception e){
			System.out.println("Problem in Login");						
		}
		
	}


}
