package Strings;

public class Substring {
    
    public static void main(String[] args) {
        String str = "HELLOWORLD";
        System.out.println(Sub(str,0,4));
        
    }

    public static String Sub(String str, int si,int ei) //function mein String likha hai
    {

        String substr = " "; // empty string at first 
        for(int i = si; i < ei ; i ++){
            substr += str.charAt(i); /*for i = 0 ,substr is H : for i = 1 substr is E : i =2 is L : i =3 L also ending part is excluded mosst imp */
        }
        return substr;
    }
}
