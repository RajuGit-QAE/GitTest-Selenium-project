package excelautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExcelTest {
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/login");
	  
	  driver.manage().window().maximize();
	  
	  sleep(3000);
	  
	  File file = new File("C:\\Users\\leoga\\OneDrive\\Desktop\\TestAmazon.xlsx");
	  
	  FileInputStream inputstream = new FileInputStream(file);
	  HSSFWorkbook wb = new HSSFWorkbook(inputstream); 
	  HSSFSheet sheet = wb.getSheet("TestAmazon");
//	  HSSFRow row1 = sheet.getRow(1);
//	  HSSFCell cell1 = row1.getCell(4);
//	  String status = cell1.getStringCellValue();
//	  
//	  System.out.println("status is" + status);
	  
	  int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
      
      //iterate over all the row to print the data present in each cell.
      for(int i=0;i<=rowCount;i++){
          
          //get cell count in a row
          int cellcount=sheet.getRow(i).getLastCellNum();
          
          //iterate over each cell to print its value
          System.out.println("Row"+ i+" data is :");
          
          for(int j=0;j<cellcount;j++){
              System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
          }
          System.out.println();
      }
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
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
