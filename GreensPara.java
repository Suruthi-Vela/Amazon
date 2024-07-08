package org.Day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;

import java.util.List;

import org.openqa.selenium.By;

public class GreensPara {
	private void q2()throws InterruptedException {
		WebDriver f= new FirefoxDriver();
		f.get("http://greenstech.in/selenium-course-content.html");
		f.findElement(By.xpath("//span[@title='Trainer']")).click();
		Thread.sleep(2000);
		WebElement element3 = f.findElement(By.xpath("//b[contains(text(),'Velmurugan')]"));
		String text3 = element3.getText();
		System.out.println(text3);
		WebElement element = f.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[2]"));
		String text = element.getText();
		System.out.println(text);
		WebElement element2 = f.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[3]"));
		String text2 = element2.getText();
		System.out.println(text2);
	}
	private void q5() {
		WebDriver e=new EdgeDriver();
		e.get("http://www.greenstechnologys.com/");
		List<WebElement> webelements = e.findElements(By.xpath("//p[contains(@style,'text-align:')]"));
		System.out.println("size:"+webelements.size());
		for (WebElement Element : webelements) {
			String text = Element.getText();
			if(text.startsWith("Greens Technology"))
			{
				System.out.println(text);
			}
		}

	}
	public static void main(String[] args) throws InterruptedException {
		GreensPara gp= new GreensPara();
		gp.q2();
		gp.q5();
	}

}
