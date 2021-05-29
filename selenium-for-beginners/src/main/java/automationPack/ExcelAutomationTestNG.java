package automationPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelAutomationTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Tools/Eclipse/selenium-for-beginners/src/main/resources/chromedrivernew version-89.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.rainfocus.com/flow/informatica/aas21/summitstart/createaccount");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@DataProvider
	public void getTestData() {
		
		
		
	}
	
	
	
	@Test
	public void regTest(String firstName, String lastName, String BusEmail) {
		
		driver.findElement(By.id("formAttendee-firstname")).clear();
		driver.findElement(By.id("formAttendee-firstname")).sendKeys(firstName);
		
		driver.findElement(By.id("formAttendee-lastname")).clear();
		driver.findElement(By.id("formAttendee-lastname")).sendKeys(lastName);
		
		driver.findElement(By.id("formAttendee-email")).clear();
		driver.findElement(By.id("formAttendee-email")).sendKeys(BusEmail);
		
		
		
	}
	
//	@DataProvider
//	public getData() {
//		
//		return 1;
//	}
	
	@AfterMethod
	public void tesrDown() {
		
		driver.close();
	}

}
