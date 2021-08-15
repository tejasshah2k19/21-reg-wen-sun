
//c c++ --> char[] 
//string - collection of characters -- String:class  

import java.util.Scanner; 

class StringDemo{

    public static void main(String[] args) {
        
        String str = "royal"; // str ref ==> royal value 
        String str2 = new String("royal"); // str2 ref => royal value => new instance 


        Scanner scr = new Scanner(System.in);
        // str = scr.next();//scan a string without space 
        // System.out.println(str);

        // str = scr.nextLine();//scan a string with space 
        // System.out.println(str);

        String x = "royalEducation";
                //  01234.........
 
        //string immutable 
        for(int i=0;i<x.length();i++){
            System.out.println(x.charAt(i));//0 1     
        }
        

    }
}