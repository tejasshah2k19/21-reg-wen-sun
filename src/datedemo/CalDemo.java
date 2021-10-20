package datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalDemo {
	//7.30 pm 

	// 12 1212122 --> duba --> 5.30 usa 4.30
	// 7.30 PM
	// USA -> 13.50 
	public static void main(String[] args) {
		Calendar c  = Calendar.getInstance();
		System.out.println(c); // +5.30 => miliseconds ==>
		
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		
		//24hours --> days [date]  
		//days --> month 
		//month --> year 
		
		//45 days 
		//roll()  
//		c.add(Calendar.DATE, 45+29);//45 days 
		c.roll(Calendar.DATE, 45);//45 days  //20 +45 
		 
		System.out.println(c.get(Calendar.DATE));//4 
		Date d = new Date(c.getTimeInMillis()); // convert  cal -> date 
		System.out.println(d);
		
		System.out.println(c.get(Calendar.MONTH));
		
		
	}
}










