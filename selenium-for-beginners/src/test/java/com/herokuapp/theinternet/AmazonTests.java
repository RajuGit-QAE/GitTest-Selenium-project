package com.herokuapp.theinternet;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class AmazonTests {

	@Test
	public void loginTest() throws IOException {

		// creating the driver

		System.out.println("Test Started");

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew version-89.exe");
		WebDriver driver = new ChromeDriver();

		// open the test page
		String url = "https://www.amazon.in/";
		driver.get(url);
		System.out.println(url);

		// wait for some time
		sleep(3000);

		// maximize the browser
		driver.manage().window().maximize();

		sleep(2000);

		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		action.moveToElement(hover).perform();

		sleep(2000);

		WebElement signinbutton = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		signinbutton.click();

		sleep(2000);

//		String message = driver.getCurrentUrl();
//		System.out.println(message);

		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("leoganapathy5691@gmail.com");

		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();

		sleep(2000);

		WebElement password = driver.findElement(By.id("ap_password"));
		WebElement signinsubmitbutton = driver.findElement(By.id("signInSubmit"));

		password.sendKeys("Amazon@123");
		signinsubmitbutton.click();

		sleep(4000);

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\Raju"));

//		WebElement search = driver.findElement(By.id("searchDropdownBox"));
//		search.click();
		
		sleep(3000);
		
		java.util.List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println("The output is: " + count.size());

		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByIndex(7);
		
		sleep(2000);
		
		WebElement slctelement = dropdown.getFirstSelectedOption();
		String output = slctelement.getText();
		System.out.println("The Output is: "+ output);

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
