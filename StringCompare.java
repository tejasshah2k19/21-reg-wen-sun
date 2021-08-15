class StringCompare{
    public static void main(String[] args) {
        String x  = "royal";
        String y = new String("royal");

        // if( x == y)
        // {
        //     System.out.println("Strings are same");
        // }else{
        //     System.out.println("Strings are not same");
        // }

            //==  ref 
            //equals == value { if same return true not same return false}
        if( x.equals(y) ){
            System.out.println("Strings are same");
        }else{
            System.out.println("Strings are not same");
        }
    }
}

// compilation error 
//same
//not same 
