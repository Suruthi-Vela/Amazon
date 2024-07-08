package org.Day4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
public static void main(String args[])
{
	WebDriver driver= new FirefoxDriver(); 
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Apple@fruits.com");
	String emailprint = email.getAttribute("value");
	System.out.println("The email is :"+emailprint);
	WebElement pwd=driver.findElement(By.id("pass"));
	pwd.sendKeys("123456");
	String password=pwd.getAttribute("Value");
	System.out.println(password);
}
}
