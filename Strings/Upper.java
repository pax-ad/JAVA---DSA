package Strings;

public class Upper {
    //hi , i am aman 
    //iss sentence ke first letter ko upper case mein karo

    public static void main(String[] args) {
        String str = "hi , i am aman";
        System.out.println(TOuppercase(str));
    }

    public static String TOuppercase(String str){
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i <+str.length() -1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }
            else{

                sb.append(str.charAt(i)); // jab maine else nahi likha tab "H , I A A" print hua
            }
        }
      return sb.toString();
    }
    
}
