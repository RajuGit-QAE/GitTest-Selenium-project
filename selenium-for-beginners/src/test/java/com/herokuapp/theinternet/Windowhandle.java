package com.herokuapp.theinternet;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle {
	@Test
	public void win() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew version-89.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String mainpage = driver.getWindowHandle();
		
//		WebElement foremp = driver.findElement(By.xpath("//div[contains(@class,'mTxt') and (text()='For Employers')]"));
		
//		foremp.click();
		
		Set<String> allwin = driver.getWindowHandles();
		
		int count = allwin.size();
		
		System.out.println("number of child windows: " + count);
		for(String child:allwin) {
			
			if(!mainpage.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				String title = driver.getTitle();
				
				System.out.println("page heading is : " + title);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
//				WebElement reg = driver.findElement(By.xpath("//li[contains(@class,'boxSel sel')  and text()='Login/Register']"));
//				
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				
//				reg.click();
				
				driver.close();
			}
		}
		
		driver.switchTo().window(mainpage);
		
		driver.close();
		
		
	}

}
