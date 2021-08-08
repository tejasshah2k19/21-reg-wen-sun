

//INHERITANCE :- object of one class can access
	//	property of another class
//extends keyword to apply inheritance between two class 
//giver : parent - super - base  
//take  : child -  sub   - derived  
//class , object , inheritance 

//coupling* ---low 
//cohesion---class -- high 

//types of inheritance 
//oop --> 5 type 
//1) single 
//2) multilevel
//3) multiple 
//4) hir
//5) hyb




class BasicCalc{

	void add(){	
		System.out.println("BasicCalc::add()");
	}
	void add(int a,int b){	
		System.out.println("BasicCalc::add(a,b)");
	}


	//sub
	//mul
	//div 
	public static void main(String args[]){
	
		SciCalc sc = new SciCalc();
		sc.sin();
		sc.add();//
	
	}

}

class SciCalc extends BasicCalc{
	//overriding --between two class --inheritance
	//return type  method name argument 
	//void add(){	
	//	System.out.println("SciCalc::add()");
	//}
	void sin(){
		System.out.println("SciCalc::sin()");
	}

}


class SuperCalc extends SciCalc{ //BasicCalc 
	//
	void bitCoin(){
	//
	}
}