//==========Problem========//

// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.

// Example 1

// Input: n=5, arr = [1,2,3,4,5]
// Output: [5,4,3,2,1]


// Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]

// Example 2
// Input: n=6, arr = [1,2,1,1,5,1]
// Output: [1,5,1,1,2,1]

// Explanation: The reverse of the array [1,2,1,1,5,1] is [1,5,1,1,2,1].


//==========Code========//

import java.util.*;

public class ReverseArray {
    int left =0;
    public void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int n){
        if(left >= n-left-1){
            return;
        }
        swap(arr,left,n-left-1);
        left++;
        reverse(arr,n);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        ReverseArray ra = new ReverseArray();

        ra.reverse(arr,n);
        for(int num: arr){
            System.out.print(num+" ");
        }
        
    }

}