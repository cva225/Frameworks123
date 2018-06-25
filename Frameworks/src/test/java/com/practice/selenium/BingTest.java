package com.practice.selenium;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.LocMechUtility;
import com.rameshsoft.automation.utilities.PojoUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class BingTest  extends BaseTest{
	
	
	
	@Test
	public   void bing() throws IOException, FrameworkException  {
		
	String 	url = getPrConfigInstance().getPropertValue("bing_url");
	getWebDriver().get(url);
	getExtentTest().log(LogStatus.INFO, "url is opened");
	
	CLICK(LocMechUtility.id, getPrOrInstance().getPropertValue("bing_mapId"));
	
//CLICK(LocMechUtility.className, getPrConfigInstance().getPropertValue("map_trf_id"));
	
Set<String> s = getWebDriver().getWindowHandles();

System.out.println(s);
String  d1 = switchTo2Window();
WebDriver d2 = getWebDriver().switchTo().window(d1);

CLICK(LocMechUtility.className, getPrConfigInstance().getPropertValue("map_trf_id"));

	
	
	
	
	
	
		
		
	}

}
