package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openthefile {
	
	@Test
	public void Open() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew version-89.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
//		String path= this.getClass().getResource("/my-local-form-page.html").getPath();
		
		driver.get("C://Users//leoga//OneDrive//Documents//My Resume's//Software Test Engineer Cover Letter.docx" );
		
		driver.close();
		driver.quit();
	}

}
