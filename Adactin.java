package org.Day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class Adactin {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement usrname=driver.findElement(By.id("username"));
		usrname.sendKeys("Apple");
		String namePrint=usrname.getAttribute("value");
		System.out.println("Username   :"+namePrint);
		WebElement pwd= driver.findElement(By.id("password"));
		pwd.sendKeys("123456");
		String password=pwd.getAttribute("value");
		System.out.println("Password   :"+password);
		
	}

}
