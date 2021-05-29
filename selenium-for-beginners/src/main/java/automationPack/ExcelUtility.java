package automationPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	 static File excelall;
	public static void main(String [] args) {
	

	
	
	
	ArrayList<Object[]> al = new ArrayList<Object[]>();

		try {
			
			
			XSSFWorkbook workbook;
			FileInputStream reader;
			excelall = new File("C:/Users/leoga/OneDrive/Desktop/TestAmazon.xlsx");
			reader =  new FileInputStream(excelall);
			try {
				workbook = new XSSFWorkbook(reader);
				XSSFSheet sheet = workbook.getSheet("Automation");
				XSSFRow row = sheet.getRow(1);
				XSSFCell cell = sheet.getRow(1).getCell(1);
				int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
				
				
//
//				for (int i =1; i<= rowCount; i++){
//					
//					int cellCount = sheet.getRow(i).getLastCellNum();
//					
//					for (int j=0; j < cellCount; j++) {
//						
//						String firstName = sheet.getRow(i).getCell(j).getStringCellValue();
//						System.out.println(firstName);
//						
//					}					
//				}
				
			
				
				for(int i=1; i<=rowCount; i++){
					
					int cellCount = sheet.getRow(i).getLastCellNum();
					
					for(int j=0; j< cellCount; j++) {
						
						
						
						String lastName = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println("lastname = " + lastName);
						
						String busEmail = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println("email = " + busEmail);
					}
					
				}
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	
		
	
	

}
}
