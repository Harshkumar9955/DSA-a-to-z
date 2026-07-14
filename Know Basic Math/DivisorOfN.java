//===========Problem=========//

// You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

// A number which completely divides another number is called it's divisor.


// Example 1

// Input: n = 6

// Output = [1, 2, 3, 6]

// Explanation: The divisors of 6 are 1, 2, 3, 6.

// Example 2

// Input: n = 8

// Output: [1, 2, 4, 8]

// Explanation: The divisors of 8 are 1, 2, 4, 8.

//===========Code=========//

import java.util.*;
public class DivisorOfN {
    public int[] divisors(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                arr[index] = i;
                index++;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DivisorOfN  d = new DivisorOfN();

        int[] ans = d.divisors(n);

        for(int x : ans){
            System.err.print(x + " ");
        }



    }
    
}
