//=========Problem=========//

// You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.


// Example 1

// Input: n = 153

// Output: true

// Explanation: Number of digits : 3.

// 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.

// Therefore, it is an Armstrong number.

// Example 2

// Input: n = 12

// Output: false

// Explanation: Number of digits : 2.

// 12 + 22 = 1 + 4 = 5.

// Therefore, it is not an Armstrong number.

//=============Code===========//


import java.util.*;

public class Armstrong {
    public static boolean isArmStrong(int n){
        int count=0;
        int result =0;
        int original = n;
        
        while(n!=0){
            n=n/10;
            count = count +1;
        }
        n = original;
        while(n!=0){
            int r = n%10;
            n=n/10;
            result = result + (int) Math.pow(r,count);
        }
    
        return result == original;

        
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isArmStrong(n));
    }
    
}
