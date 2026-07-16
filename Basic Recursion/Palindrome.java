//===========Problem==========//

// Given a string s, return true if the string is palindrome, otherwise false.
// A string is called palindrome if it reads the same forward and backward.


// Example 1

// Input : s = "hannah"

// Output : true

// Explanation : The string when reversed is --> "hannah", which is same as original string , so we return true.

// Example 2

// Input : s = "aabbaA"

// Output : false

// Explanation : The string when reversed is --> "Aabbaa", which is not same as original string, So we return false.



//================Code============//

import java.util.*;

public class Palindrome {
    int i=0;
    public boolean palindromeCheck(String s) {
        int n = s.length();
        if(i  >= n/2) return true;

        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        i++;
        return palindromeCheck(s);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Palindrome pt = new Palindrome();

        System.out.println(pt.palindromeCheck(s));
        
    
    }
}