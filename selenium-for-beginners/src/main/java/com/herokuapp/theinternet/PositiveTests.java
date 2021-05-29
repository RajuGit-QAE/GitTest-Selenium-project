package com.herokuapp.theinternet;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {

		// creating the driver

		System.out.println("Test Started");

		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// open the test page
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println(url);

		// wait for some time
		sleep(3000);

		// maximize the browser
		driver.manage().window().maximize();

		sleep(2000);

		// username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");

		sleep(2000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");

		sleep(2000);

		WebElement loginbutton = driver.findElement(By.tagName("button"));
		loginbutton.click();

		sleep(2000);

		// verification

		WebElement logoutbutton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		logoutbutton.click();

		sleep(2000);

		String expectedUrl = "https://the-internet.herokuapp.com/login";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedUrl, "URL is not matching");

		sleep(2000);
		
		File scrfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(scrfile,new File("D:\\Rs.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		// close browser
		
		driver.close();
		
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
