package Strings;

public class Shortestpath {

    public static void main(String[] args) {
        // we were given a string like "WNEENESENN" for direction of movement
        //use distantce formula √(x2^2 - x1^2) + (y2^2 - y1^2)  
        String str ="NEW";
        Path(str);
    }

    public static void Path(String str){
        int n = str.length();
   
        int x = 0,y=0;
        for(int i = 0 ; i < n; i++){
            switch(str.charAt(i)){
                case 'N': y ++; // don't write as case(i==N)
                                break;
                case 'S': y--;
                                break;
                case 'W': x --;
                                break;
                case 'E': x ++;
                                break;
            }

        }
        double distance = Math.sqrt( x*x + y*y);
        System.out.println(distance);


    }
    
}
