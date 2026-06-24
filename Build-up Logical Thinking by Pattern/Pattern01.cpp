// ==============Problem=============//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// *****

// *****

// *****

// *****

// *****


// ===========Code==========//

#include<bits/stdc++.h>
using namespace std;

void PrintPattern1(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cout << "*";
        }
        cout <<  endl;
    }

}

int main(){
    int n;
    cin >> n;
    PrintPattern1(n);
    return 0;
}







