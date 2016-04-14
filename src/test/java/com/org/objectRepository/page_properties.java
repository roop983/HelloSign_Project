package com.org.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_properties {

	private static WebElement element = null;
	
	//****************** VARIABLES  *************
	
	public static String email_address1 = "notanemail";
	public static String email_address2 = "email@example.com";
	public static String passwrd1 = "notapassword";
	public static String passwrd2 = "wrongpass";
	public static String expected_error_message1 = "Invalid email address";
	public static String expected_error_message2 = "Invalid username/password combo.";
	
	//****************** URLs  *************
	public static String url="https://www.hellosign.com/";
	
	//****************** LINKS  *************
	public static WebElement Log_In(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='dropDownMenu']/div/span[1]/div/a"));
		return element;
	}
	//****************** TEXT BOXES  *************	
	public static WebElement Email(WebDriver driver)
	{
		element = driver.findElement(By.id("login_email_address_input"));
		return element;
	}
	
	public static WebElement Password(WebDriver driver)
	{
		element = driver.findElement(By.id("login_password_input"));
		return element;
	}
	
	//****************** BUTTONS  *************	
	public static WebElement Sign_In(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//form[@id='login_form']/div/div[3]/div[5]/button/span"));
		return element;
	}
	
	//****************** ERROR_MESSAGES  *************	
	public static WebElement Error_Message(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//form[@id='login_form']/div/div[3]/div[5]/div/p"));
		return element;
	}
}
