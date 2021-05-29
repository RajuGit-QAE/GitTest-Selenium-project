package alljavapackages;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {

	public static void main(String[] args) {
		
		DateFormat inputFormat = new SimpleDateFormat("yyyy-mm-dd");
		DateFormat outputFormat = new SimpleDateFormat("mm/dd/yyyy");
		String inputDateStr="2090-06-24";
		Date date = null;
		
		try {
			date = inputFormat.parse(inputDateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String outputDateStr = outputFormat.format(date);
		System.out.println(outputDateStr);
	}

}
