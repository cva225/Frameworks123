package com.practice.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class FlipkartTest  {
	
	@Test
	public  void flipkart() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Frameworks\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");
		
	/*	String s =d.getWindowHandle();
		System.out.println(s);
		Set< String>  s1 = d.getWindowHandles();
		System.out.println(s1);
		*/
		
		d.findElement(By.className("_2zrpKA")).sendKeys("9000125315");
		d.findElement(By.className("_3v41xv")).sendKeys("siva225");
		
		Actions  act = new Actions(d);
		act.sendKeys(Keys.ENTER).perform();
		//d.switchTo().defaultContent();
		d.findElement(By.className("LM6RPg")).sendKeys("cva");
	
		
	
		//act.moveToElement(d.findElement(By.xpath("//a[@class = '_1QZ6fC']/span[0]"))).perform();

		
		
		

	}

}
