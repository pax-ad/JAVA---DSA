package Strings;

public class Comparison {

    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");
        
        if (s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not eqaul");
        }

        if(s2==s3){ //not equal because their is concept in java interning , whenever yuo create a string not with using new keyword it points to old same string in the memory,
                        // but with new a fresh string is creaated
              System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not eqaul");
        }

        if(s1.equals(s3)){ // use this for comparison
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not eqaul");
        }
    }
    
}
