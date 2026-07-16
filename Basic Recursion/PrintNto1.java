//=========Problem=============//

// Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.

// // You must not use any loops such as for, while, or do-while.
// // The function should print each number on a separate line, in decreasing order from n to 1

// // Example 1

// // Input: 5

// // Output:

// // 5

// // 4

// // 3

// // 2

// // 1

// // Example 2

// // Input: 1

// // Output:

// // 1

//============Code============//



import java.util.*;

public class PrintNto1 {
    public void printNumbers(int n){
        if(n == 0) return;
        
        System.out.println(n);
        printNumbers(n-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintNto1 pt = new PrintNto1();

        pt.printNumbers(n);
    }
    
}
