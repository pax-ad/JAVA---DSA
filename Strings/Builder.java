package Strings;

public class Builder {
    //programme for string builder
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for ( char ch ='a';ch<='z';ch++){ //we are printing a to z ; 26 letters string
            sb.append(ch); //apend will print strings past the letter we mentionde.
        }
        System.out.println(sb);

        Integer a = 10;
        a.toString();
        System.out.println(a);
        

    }
}
