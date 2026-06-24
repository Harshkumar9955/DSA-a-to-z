//===========Problem=========//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


//==========Code==========//

#include<bits/stdc++.h>
using namespace std;

void Pattern10(int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<i+1;j++){
            cout << "*";
        }
        cout << endl;
    }
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            cout << "*";
        }
        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;

    Pattern10(n);

    return 0;
}