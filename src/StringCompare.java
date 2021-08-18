class StringCompare{
    public static void main(String[] args) {
        String x  = "royal";
        String y = new String("Royal");

        // if( x == y)
        // {
        //     System.out.println("Strings are same");
        // }else{
        //     System.out.println("Strings are not same");
        // }

            //==  ref 
            //equals == value { if same return true not same return false}

		boolean ans = x.equals(y);// true false
		if (x.equals(y)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are not same");
		}

		if (x.equalsIgnoreCase(y)) {
			System.out.println("Strings are same [ ig ] ");
        }else{
            System.out.println("Strings are not same [ ig ]");
        }
    
		int ans1 = x.compareTo(y); //x-y
        System.out.println(ans1);
        
        ans1 = x.compareToIgnoreCase(y);
        System.out.println(ans1);
        
        if(x.compareTo(y) == 0 ) {
        	System.out.println("same compareTo");
        }else {
        	System.out.println("not same compareTo");
        }
        
        if(x.compareToIgnoreCase(y) == 0 ) {
        	System.out.println("same compareToIG");
        }else {
        	System.out.println("not same compareToIG");
        }
    }
    
}

// compilation error 
//same
//not same 
