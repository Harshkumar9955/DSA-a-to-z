//==========Problem==========//

// You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.

// A palindrome number is a number which reads the same both left to right and right to left.


// Example 1

// Input: n = 121

// Output: true

// Explanation: When read from left to right : 121.

// When read from right to left : 121.

// Example 2

// Input: n = 123

// Output: false

// Explanation: When read from left to right : 123.

// When read from right to left : 321.


//=========Code=======//

import java.util.*;

public class Palindrome{

    static boolean checkPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n!=0){
            int last = n%10;
            rev = rev*10+last;
            n=n/10;
        }
        return original == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(checkPalindrome(n));

    }
}