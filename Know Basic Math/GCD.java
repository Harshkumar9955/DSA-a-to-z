//==========Problem==========//

// You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.


// The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.


// Example 1

// Input: n1 = 4, n2 = 6

// Output: 2

// Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

// Greatest Common divisor = 2.

// Example 2

// Input: n1 = 9, n2 = 8

// Output: 1

// Explanation: Divisors of n1 = 1, 3, 9 Divisors of n2 = 1, 2, 4, 8.

// Greatest Common divisor = 1.

//===========Code==========//

import java.util.*;

public class GCD {

    public int GCDfinder(int n1, int n2){
        while(n2!=0){
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        return n1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        GCD obj = new GCD();
        System.out.println(obj.GCDfinder(n1,n2));
    }
    
}
