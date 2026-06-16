// ========Problem=========//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// *

// **

// ***

// ****

// *****



//==========Code===========//

#include<bits/stdc++.h>
using namespace std;

void Pattern2(int n){

    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout << "*";
        }
        cout << endl;
    }

}

int main(){

    
    int t;
    cin >> t;

    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;
        Pattern2(n);
    }
    

    
    return 0;
}