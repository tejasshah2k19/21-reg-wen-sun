import java.util.Scanner; 

//Scope of the variable -- life -->  visiblity

/*
	instance
	local --> { block , stack } memory --> stack | heap  
	static

*/
//pure --> encapsulation --> pure oop --> class  
class MyCalc {

	int a,b,ans; // instance varaible  --> instance / object  
	static int bankCode=100; //single copy -- entire class 
	
	//static  
	void input(){	 //local 
		Scanner scr =new Scanner(System.in); //scr is local 
		System.out.println("Enter two numbers");
		a = scr.nextInt();//30
		b = scr.nextInt();//50	
		
	}
	void add(){
		ans = a+b;
		System.out.println("Addition = "+ans);//Addition = 80
		System.out.println(a+" + "+b+" = "+ans);//30 + 50 = 80 
	}

	void sub(){
		ans = a-b;
		System.out.println("Subtraction = "+ans);//Addition = 80
		System.out.println(a+" - "+b+" = "+ans);//30 + 50 = 80 
	}

	void mul(){
		ans = a*b;
		System.out.println("Mul = "+ans);//Addition = 80
		System.out.println(a+" * "+b+" = "+ans);//30 + 50 = 80 
	}

	public static void main(String args[]){
		Scanner scr =new Scanner(System.in);
		int choice; 
		MyCalc obj = new MyCalc();//MyCalc()
		obj.bankCode = 5000; 
			 
	     while(true){
		//int abc; //block 
		obj.input();
		System.out.println("Press\n1 For Add\n2 For Sub\n3 For Mul\n0 For Exit\nEnter Your Choice");
		choice = scr.nextInt();
		
		switch(choice){
			
			case 1:
				obj.add();
				break;
			case 2:
				obj.sub();
				break;
			case 2+1:
				obj.mul();
				break;
			case 0:	
				System.exit(0);
			default:
				System.out.println("Please input valid choice!!!"); 
				
		}//switch
	    }//while 
		//
	}//main

}//class


 

 