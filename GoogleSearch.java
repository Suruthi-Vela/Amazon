package org.Day4;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.*;
public class GoogleSearch {

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new EdgeDriver();
		driver.get("http://www.google.com/");
		WebElement search=driver.findElement(By.xpath("//textarea[@title='Search']"));
		search.sendKeys("greens velmurugan");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//h3[contains(text(),'Velmurugan ')])[1]")).click();
	}

}
