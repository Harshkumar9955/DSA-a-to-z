//=========Problem==========//

// You are given an integer n. Return the value of n! or n factorial.

// Factorial of a number is the product of all positive integers less than or equal to that number.


// Example 1

// Input: n = 2

// Output: 2

// Explanation: 2! = 1 * 2 = 2.

// Example 2

// Input: n = 0

// Output: 1

// Explanation: 0! is defined as 1.

//============Code==============//

import java.util.*;

public class Nfactorial {
    public int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Nfactorial f = new Nfactorial();

        System.out.println(f.factorial(n));
    }






    
}
