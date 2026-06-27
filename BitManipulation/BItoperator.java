package BitManipulation;

public class BItoperator {
    
    public static void main(String[] args) {
        //thr result are calculated based on the rules from the opearator table for 0 and 1

        //binary AND 5 = 101 and 6 = 110 gives 4=100
        System.out.println(5&6);

        //binaary OR 
        System.out.println(5|6);

        //binary XOR^
        System.out.println(5^6);

        //one's compliement
        System.out.println(~5);
        //(~5)->(~101)->(010) which is 2 but it shoes as 6 in compiler cause ; 101 + 1 => 110 (6)

        //two's compliment
        System.out.println(~5+1);

        //binary left shift
        System.out.println(5<<2);
        //a<<b = a x 2^b 

        //binary right shift
        System.out.println(6>>1);
        //a>>b = a/2^b


    }
}
