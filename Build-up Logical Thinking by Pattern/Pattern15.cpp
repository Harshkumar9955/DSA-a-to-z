//============Problem===========//
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// ABCDE
// ABCD
// ABC
// AB
// A

//========Code=======//

#include<bits/stdc++.h>
using namespace std;

void Pattern15(int n){
    for(int i=n;i>0;i--){
        char ch = 65;
        for(int j=0;j<i;j++){
            cout << ch;
            ch++;
        }
        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;

    Pattern15(n);

    return 0;
}