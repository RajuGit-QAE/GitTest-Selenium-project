package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.rainfocus.com/flow/informatica/aas21/summitstart/createaccount");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement element = driver.findElement(By.id("confirmpassword"));
		//js.executeScript("argument[0].scrollIntoView();", element);
	//	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]>testData = ExcelUtil.getDataFromExcel();
		return testData.iterator();
		
		
	}
	
	
	
	@Test(dataProvider = "getTestData")
	public void regTest(String firstName, String lastName, String BusEmail) {
		
		driver.findElement(By.id("formAttendee-firstname")).clear();
		driver.findElement(By.id("formAttendee-firstname")).sendKeys(firstName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("formAttendee-lastname")).clear();
		driver.findElement(By.id("formAttendee-lastname")).sendKeys(lastName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("formAttendee-email")).clear();
		driver.findElement(By.id("formAttendee-email")).sendKeys(BusEmail);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
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

	


