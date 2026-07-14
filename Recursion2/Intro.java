package Recursion2;

public class Intro {
    
    //tiling problem

    /*given a "2 x n" board and tiles of size "2 x 1" , coun the number of ways to tile the given board using the "2x1" tiles. */

    // a tile can be placed horizontally aor vertically

    /*approach
    1.base case 
    2.work
    3.call inner function

    n=0 , 2 x 0 ways =1 //koi bhi tiles na rakna bhi ek way hai
    n=1 , 2 x 1 , ways = 1
    n=2 , 2 x 2 ,ways = 2
    n =3 , 2 x 3 ways =3

    for n=3 our choice depends on how  we wan tot add the tile like horizontally or vertically


    */

    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
    }

    public static int tilingproblem(int n ){
        //( 2 x n ) floor size
        // work 

        //base case 
        if(n==0 || n ==1){
            return 1;
        }
       
       
        // vertical choice
        
        int fnm1 = tilingproblem(n-1);

        // horizontal choice

        int fnm2 = tilingproblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;

    }


    //this is not most optimized way of doing things , but as of nowwe jsut learned recursion, soon after dynamic programming we will write optimized way.
}
