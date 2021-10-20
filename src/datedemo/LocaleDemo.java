package datedemo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		//Locale => represent a specific geographical or political or cultural region 
		
		//Locale => ind --> dd mm yyyy 
		//			usa --> mm dd yyyy 
		//Cal 
		Date d = new Date();
		System.out.println(d);// string
		
		//Locale fr = new Locale("hi", "in"); // french

		Locale fr = new Locale("zh","CN"); // french

		// formatting
		DateFormat df = DateFormat.getDateInstance();// default date format
		System.out.println("Date ==> " + d);
		System.out.println("Default DF => " + df.format(d)); // 17 Oct 2021

		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT,fr);
		
		System.out.println("Short => " + dfShort.format(d));// 17/10/21

		DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM,fr);
		System.out.println("Medium => " + dfMedium.format(d));//

		DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG,fr);
		System.out.println("Long => " + dfLong.format(d));//

		DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL,fr);
		System.out.println("Full => " + dfFull.format(d));//

	}
}
