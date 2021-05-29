package JavaSessions;

import java.util.ArrayList;

public class ExcelUtil {
	
	static Xls_Reader reader;
	
	public static  ArrayList<Object[]> getDataFromExcel() {
	
	 ArrayList<Object[]> al = new ArrayList<Object[]>();
	
	try {
		reader = new Xls_Reader("C:/Users/leoga/OneDrive/Desktop/TestAmazon.xlsx");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	for( int i= 2; i<= reader.getRowCount("Automation"); i++) {
		
		String firstName = reader.getCellData("Automation", "firstName", i);
		String lastName = reader.getCellData("Automation", "lastName", i);
		String busEmail = reader.getCellData("Automation", "busEmail", i);
		
		
		Object [] ob = {firstName,lastName,busEmail};
		al.add(ob);
		
		
	}
	return al;
	

}
}