//===Problem=====//

// Given two integers low and high, return the sum of all integers from low to high inclusive.


// Example 1

// Input: low = 1, high = 5

// Output: 15

// Explanation: 1 + 2 + 3 + 4 + 5 = 15

// Example 2

// Input: low = 3, high = 7

// Output: 25

// Explanation: 3 + 4 + 5 + 6 + 7 = 25


//=====Code=====//

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int forLoop(int low, int high) {
        // Your code goes here
        int sum = 0;
        for(int i=low;i<=high;i++){
            sum = sum + i;
        }
        cout << sum;
    }
};

int main(){
    Solution Obj;
    int low, high;
    cin >> low;
    cin >> high;
    Obj.forLoop(low,high);
    return 0;

}