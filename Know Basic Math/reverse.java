//============Problem============//

// You are given an integer n. Return the integer formed by placing the digits of n in reverse order.


// Example 1

// Input: n = 25

// Output: 52

// Explanation: Reverse of 25 is 52.

// Example 2

// Input: n = 123

// Output: 321

// Explanation: Reverse of 123 is 321.


//=============Code=============//

import java.util.*;

public class reverse{

    static int reverseNum(int n){
        int rev = 0;
        while(n!=0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n=n/10;
        }
        return rev;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(reverseNum(n));


    }
}