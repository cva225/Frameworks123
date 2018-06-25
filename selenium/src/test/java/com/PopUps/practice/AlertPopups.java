package com.PopUps.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertPopups {
	
	@Test
	public  void gmailtest() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\Lib\\bin\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Actions act = new Actions(d);
		d.get("https://www.facebook.com");
	WebElement	ele=d.findElement(By.id("email"));
	ele.clear();
	ele. sendKeys("vca");

		

	}

}
