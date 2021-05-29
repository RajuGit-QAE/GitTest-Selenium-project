package com.automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelAutomationtestNG {
	  
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("driver.chrome.driver", "C:/Users/leoga/Downloads/chromedriver_win32.exe");
		
		
	}
	
	
	@Test(dataProvider="getData")
	public void regTest() {
		
		
		
	}
	
	
	@DataProvider
	public void getData() {
		
	}
}
