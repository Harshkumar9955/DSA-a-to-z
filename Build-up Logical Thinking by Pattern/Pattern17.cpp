//==========Problem=============//
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA


//============Code==========//

#include<bits/stdc++.h>
using namespace std;

void Pattern17(int n){
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            cout << " ";
        }
        char ch = 65;
        int mid = (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            cout << ch;
            if(j <= mid){
                ch++;
            }
            else{
                ch--;
            }
        }

        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;

    Pattern17(n);

    return 0;
}