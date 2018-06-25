package com.one.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OneTestTest {
	
	@Test
	void gmailtest() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		d.get("https://www.naukri.com");
		//d.switchTo().alert().dismiss();
		
	String parent  = 	d.getWindowHandle();
	System.out.println(parent);
	
	Set<String>  allwindows = d.getWindowHandles();
	System.out.println(allwindows);
	int count = 0 ;
	
	/*List<String> allwindows2 = new ArrayList<>(allwindows);
	System.out.println(allwindows2);
	String  w1 = allwindows2.get(1);
	d.switchTo().window(w1);
	d.manage().window().maximize();
	d.switchTo().activeElement().click();*/
	for (String s1: allwindows) {
		d.switchTo().window(s1);getClass();
		List<WebElement> eleList = d.findElements(By.xpath("//*"));
		 for (WebElement web : eleList) {
			 if (web.getTagName().equalsIgnoreCase("select")) {
				 System.out.println("it is a checkbox");
				count++;
			}
			
		}
		
	}
	System.out.println(count);
	
	
	

	
	

}
}
