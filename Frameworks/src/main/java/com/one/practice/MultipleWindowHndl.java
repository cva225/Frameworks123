package com.one.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultipleWindowHndl 


{
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
	for (String s1: allwindows) {
		
		d.switchTo().window(s1);
		System.out.println(d.getTitle());
		
		List<WebElement> eleList = d.findElements(By.xpath("//*"));
		 for (WebElement web : eleList) {
			//if (web.getTagName().equalsIgnoreCase("select")) {
				 System.out.println("it is a checkbox");
				count++;
			//}
			
		}
		
	}
System.out.println(count);
}
}



/*String parent  = 	d.getWindowHandle();
System.out.println(parent);

Set<String>  allwindows = d.getWindowHandles();
System.out.println(allwindows);
List<String> allwindows2 = new ArrayList<>(allwindows);
System.out.println(allwindows2);

for (String window : allwindows) {
	
	
	if (!window.equalsIgnoreCase(parent)) {
		
		
		
		
		String s = allwindows2.get(2);
        d.switchTo().window(s);
		
		
		System.out.println("window name :"+d.getTitle());
		
		//WebElement e=d.findElement(By.id("Sug_kwdsugg"));
		Actions ac = new Actions(d);
		ac.doubleClick().perform();
		//e.sendKeys("sivakumar");
		

*/





