package com.herokuapp.theinternet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pophandles {
	@Test
	public void pop() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew version-89.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String mainpage = driver.getWindowHandle();
		
		Alert alrt = driver.switchTo().alert();
//		alrt.accept();
		alrt.dismiss();
		
		driver.switchTo().window(mainpage);
		
		driver.close();
		driver.quit();
	}

}