package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PuruTest {
	
	@Test
	public  void puru() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\Frameworks\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("https://www.moneycontrol.com");
		d.findElement(By.xpath("//a[@class = 'link1 dropdown-toggle linkSignIn']")).click();

		d.switchTo().frame("myframe");
		System.out.println("ddddkndvkvd");
		//d.findElement(By.id("email")).sendKeys("siva");
		WebElement ele =d.findElement(By.className("modal-open"));
		ele.click();
		ele.clear();
		ele.sendKeys("siva");
		
		
		
		
	}

}
