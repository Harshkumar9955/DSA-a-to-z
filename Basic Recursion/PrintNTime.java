//===========Problem============//

//Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
// You must not use any loops such as for, while, or do-while.
// The function should print each number on a separate line, in increasing order from 1 to n.

// Example 1

// Input: n = 5

// Output:

// 1  

// 2  

// 3  

// 4  

// 5

// Example 2

// Input: n = 1

// Output:

// 1


//===========Code=============//

import java.util.*;

public class PrintNTime {
    int count = 0;
    public void printNumbers(int n){
        if(count == n) return;
        count++;
        System.out.println(count);
        printNumbers(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintNTime pt = new PrintNTime();

        pt.printNumbers(n);
    }
    
}
