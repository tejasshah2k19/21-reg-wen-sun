import java.util.Scanner; 

class VowelWordCount{

    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scr.nextLine(); 

        int vowel = 0;
        int words = 1;

        
        str = str.toLowerCase(); // this will convert your string into lowercasae 
        //toUpperCase() // this will convert your string into uppercase 
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'  || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
                vowel++;
            }
            if(str.charAt(i) == ' '){
                words++;
            }

        }

        System.out.println("Total Vowels = "+vowel);
        System.out.println("Total Words = "+words);
        System.out.println("String = "+str);
    
    }
}