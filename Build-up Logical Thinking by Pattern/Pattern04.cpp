// ==========Problem========//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// 1

// 22

// 333

// 4444

// 55555


// ========Code===========//

#include<bits/stdc++.h>
using namespace std;

void Pattern4(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout << i+1;
        }
        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;
    Pattern4(n);
    return 0;
}