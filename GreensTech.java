package org.Day4;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GreensTech {

	public static void main(String[] args) {
		WebDriver f= new FirefoxDriver();
		f.get("http://www.greenstechnologys.com/");
		System.out.println("ques1");
		WebElement element = f.findElement(By.xpath("(//u[contains(text(),'Greens')])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println("Ques 3");
	}

}
