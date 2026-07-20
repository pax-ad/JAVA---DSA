package Recursion2;

import java.util.ArrayList;
import java.util.List;
public class BinaryString {
    




    // Recursive function matching your exact argument structure
    public static void generateStrings(int n, int last_place, String str, List<String> result) {
        // Base Case: If remaining length is 0, the string is complete
        if (n == 0) {
            result.add(str);
            return;
        }

        // Choice 1: We can always append '0'. Next last_place becomes 0.
        generateStrings(n - 1, 0, str + "0", result);

        // Choice 2: We can append '1' ONLY if the last placed digit was not 1
        if (last_place != 1) {
            generateStrings(n - 1, 1, str + "1", result);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> validStrings = new ArrayList<>();
        
        // Initial call: 
        // n = size, last_place = 0 (so we can start with either 0 or 1), str = empty string
        generateStrings(n, 0, "", validStrings);
        
        System.out.println("Binary strings of size " + n + " without consecutive ones:");
        for (String s : validStrings) {
            System.out.println(s);
        }
    }
}



