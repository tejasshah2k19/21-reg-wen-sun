package datedemo;
import java.text.DateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d = new Date();//1 jan 1970 
		System.out.println(d);//string 
		  
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDay());
		System.out.println(d.getSeconds());
		System.out.println(d.getHours());


		//formatting 
		DateFormat df = DateFormat.getDateInstance();//default date format 
		System.out.println("Date ==> "+d);
		System.out.println("Default DF => "+df.format(d)); //17 Oct 2021 
		
		
		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Short => "+dfShort.format(d));//17/10/21
		
		
		
		DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Medium => "+dfMedium.format(d));// 
		
		
		DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Long => "+dfLong.format(d));// 
		
		
		DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Full => "+dfFull.format(d));// 
		
		
		//locale
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
