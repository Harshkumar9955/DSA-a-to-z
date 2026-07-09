//==========Problem========//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// E 

// D E 

// C D E 

// B C D E 

// A B C D E


//=========Code=========//

#include<bits/stdc++.h>
using namespace std;

void Pattern18(int n){

    for(int i=0;i<n;i++){
        char ch = 65+(n-i-1);
        for(int j=0;j<=i;j++){
            cout << ch << " ";
            ch++;
        }
        cout << endl;
    }
}



int main(){

    int n;
    cin >> n;

    Pattern18(n);

    return 0;
}