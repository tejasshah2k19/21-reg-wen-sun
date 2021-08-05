import java.util.*;// import all classes from util package 
//Scanner Cal Date . . . .

//encapsulation:- 
class Student{
	//private 
	//default 
	//protected 
	//public 	
	private String name; //instance 
	private int maths,sci,eng; 
	private float total ,perc;
	private char grade;

	static int totalStudents= 0;
	public void getData(){
		Scanner scr = new Scanner(System.in);// 
		System.out.println("Enter name and marks of three subject");
		name = scr.next(); // scan a string single word no space 
		maths = scr.nextInt(); // integer only
		sci = scr.nextInt();
		eng = scr.nextInt();
	}

	public void calculateResult(){
		total = maths + sci + eng;
		perc = (total)/3.0f; //need add "f" or "F" to indicate float value 
		if(perc > 90 ){
			grade = 'A';
		}else if(perc > 80){
			grade = 'B';
		}else if(perc >= 35){
			grade = 'C';
		}else {
			grade = 'R'; 
		}
	}

	public void printData(){
		System.out.println("Name : "+name);
		System.out.println("Maths : "+maths);
		System.out.println("Sci : "+sci);
		System.out.println("Eng : "+eng);
		System.out.println("Total : "+total);
		System.out.println("Perc : "+perc);
		System.out.println("Grade : "+grade);
	}	

	public static void main(String args[]){
	
		//to access prop of a class -- instance/object 

		Student ram  = new Student();
		ram.getData();
		ram.calculateResult();
		ram.printData();
	}

}

//result of student 
//name , maths,sci ,eng 
//total perc grade 