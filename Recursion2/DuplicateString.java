package Recursion2;

public class DuplicateString {
    
    public static void main(String[] args) {
        String str = "apnacollege";
        rmvdup(str, 0, new StringBuilder(" "),new boolean[26]);

    }

    public static void rmvdup(String str, int idx , StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char current_char = str.charAt(idx);
        if(map[current_char - 'a'] == true){
            //duplicate
            rmvdup(str,idx +1,newStr,map);
        }
        else{
            map[current_char - 'a'] = true;
            rmvdup(str,idx+1,newStr.append(current_char),map);
        }
    }
}
