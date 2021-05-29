package excelautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollUpDown {
	
	
	@Test
	public void m() {
		
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		
		sleep(3000);
		
		String URL = "https://www.amazon.in/";
		
		driver.get(URL);
		
		sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'navFooterColHead') and (text()='Get to Know Us')]"));
		
		js.executeScript(" arguments[0].scrollIntoView();" , element);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,250)");
		
		sleep(4000);
		
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
