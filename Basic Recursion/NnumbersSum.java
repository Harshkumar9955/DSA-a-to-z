//=============Problem===========//

// Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

// Example 1

// Input : N = 4

// Output : 10

// Explanation : first four natural numbers are 1, 2, 3, 4.

// Sum is 1 + 2 + 3 + 4 => 10.

// Example 2

// Input : N = 2

// Output : 3

// Explanation : first two natural numbers are 1, 2.

// Sum is 1 + 2 => 3.

import java.util.*;

public class NnumbersSum {
    public int Sum(int n){
        if(n==0){
            return 0;
        }else{
            return n+Sum(n-1);
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NnumbersSum ns = new NnumbersSum();

        System.out.println(ns.Sum(n));
    }

    
}
