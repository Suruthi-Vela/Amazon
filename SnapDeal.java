package org.Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.*;

public class SnapDeal {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search= driver.findElement(By.name("keyword"));
		search.sendKeys("Flowers");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		driver.findElement(By.xpath("//p[@title='Chrysanthemum/Guldaudi Mix Colors Hybrid Seeds For Home Gardening 30 seeds with cocopeat and growing soil']")).click();
	}

}
