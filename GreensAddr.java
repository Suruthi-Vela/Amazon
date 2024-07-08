package org.Day4;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
public class GreensAddr {

	public static void main(String[] args) {
		WebDriver f= new FirefoxDriver();
		f.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js= (JavascriptExecutor)f;
		WebElement adayar = f.findElement(By.xpath("(//h6[text()='Greens Technology '])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",adayar);
		WebElement addr = f.findElement(By.xpath("(//ul[@class='address'])[1]"));
		String adayarAddr = addr.getText();
		System.out.println("Adayar Address\t:"+adayarAddr);
		WebElement addr1=f.findElement(By.xpath("(//ul[@class='address'])[2]"));
		String omrAddr=addr1.getText();
		System.out.println("\nOMR Address\t:"+omrAddr);
	}

}
