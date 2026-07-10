//========Problem========//

// You are given an integer n. You need to return the number of digits in the number.

// The number will have no leading zeroes, except when the number is 0 itself.


// Example 1

// Input: n = 4

// Output: 1

// Explanation: There is only 1 digit in 4.

// Example 2

// Input: n = 14

// Output: 2

// Explanation: There are 2 digits in 14.


//=============Code==========//

#include<bits/stdc++.h>
using namespace std;

void countDigit(int n){
    int count=0;
    while(n!=0){
        n = n/10;
        count = count+1;
    }
    cout << count;
}

int main(){
    int n;
    cin >> n;

    countDigit(n);

    return 0;
}