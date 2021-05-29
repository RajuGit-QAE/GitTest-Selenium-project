package com.herokuapp.theinternet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Felements {
	
	@Test
	public void fele() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew version-89.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
//		System.out.println("links are:" + alllinks.size());
		
		for(WebElement link: alllinks) {
		
		System.out.println(link.getText() + "-" + link.getAttribute("href"));
		
		}
		
		
		driver.close();
		
		
		
		
		
		
	}

}
