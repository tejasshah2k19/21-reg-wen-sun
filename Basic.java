import java.util.Scanner; 
 
//folder --> package 
class Basic{

	//class - logic --group -- General 
	//object - physical[real world entity ] -- member --specialize 

	//Animal Dog 
	//Dog -- teeth , nose , ear , leg  bark() bite() walk() run()
	//Projector 
	//Laptop 
	//Human Men DhirajSir 
	//GandhiBapu -- 
	//class -> variable , method{fn}  
	//Bank --> balance ,userName,password	
		// wid() dep() chkBal() 
	//customer --> object 	 


		//Scanner -> 
			// nextInt() nextFloat() nextDouble() next() .....

		//  className objectName; 
		// new --> to allocate memory
		// objectName = new ClassName();

		//ClassName objectName = new ClassName();

 	//how to import inbuilt class 
	//how to create object / instance 
	//how to invoke/call method using object 
	//
	public static void main(String args[]){
	
		int a,b,ans;
		Scanner scr = new Scanner(System.in); 
		System.out.println("Enter Two numbers");
		a = scr.nextInt(); 
		b = scr.nextInt(); 
		ans  =a+b;
		System.out.println("Addition = "+ans);
	}
}

/*
	create a class Calc 
		print menu for add , sub , mul , div 
		ask choice to the user 
		perform operation as per user's choice 

	Note: only integers , Scanner  
*/