package com.herokuapp.theinternet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtables {
	@Test
	public void web() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew version-89.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/webtables");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement webtable = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']"));
		
		
		List<WebElement> column = webtable.findElements(By.xpath("//div[contains(@class,'rt-table')]"));
		
		System.out.println("No of Columns is: " + column.size());
		 
		
		
		
		driver.close();
				
	
	}

}
