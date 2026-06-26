package Strings;

public class Compression {
    
    public static void main(String[] args) {
        String str ="aaabbbcccdd";
        System.out.println(Compress(str));
        
    }
    public static String Compress(String str){
        String newStr = " ";
        
        for(int i = 0 ; i < str.length();i++){
            Integer count = 1; //since jo string mein letter hai usko number mein convert karna padenga phir string se int ke liye object ki wajah se INTEGER aur phir .tostring()
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
                /*  n isliye nahi liya kyuki hum i ko n-1 se compare kar rahe hai,
                    yaha humne i ko n-1 se kam rakha hai n se nahi
                    other wise for n it shows as error*/
                {

                count ++; //suppose this while loop doesn't run i.e. a ke agge b aur b ke agge c i.e abc 
                i++;

                //aaabc
                /*toh phale while loop chalenga count for a = 3, phir while ki && ke baad wali condition false ho jayengi then niche wala if */
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString(); //yaha i () mein likh diya tha
                
            }

        }
        return newStr;
    }
}
