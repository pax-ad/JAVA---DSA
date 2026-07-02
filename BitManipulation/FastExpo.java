package BitManipulation;

public class FastExpo {
    
    //programme for fast exponentiation
    public static void main(String[] args) {
        System.out.println(fast_exponentiation(2, 10));
    }

  //converting over power into binary
  public static int fast_exponentiation(int a, int b) {
    int ans = 1;
    while(b > 0) {
        if((b & 1) != 0) {
            ans *= a;
        }
        a *= a;
        b >>= 1;
    }
    return ans;
  }



}





