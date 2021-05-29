 package com.herokuapp.theinternet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Rightclick {
	@Test
	public void right() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew version-89.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement car = driver.findElement(By.xpath("//a[contains(@class,'nav_a') and  (text()='Careers')]"));
//		act.moveToElement(car).perform();
		act.contextClick(car).perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		act.doubleClick(car).perform();
	
		driver.close();
		
	}

}
