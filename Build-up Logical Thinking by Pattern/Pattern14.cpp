//=======Problem=======//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// A
// AB
// ABC
// ABCD
// ABCDE

//=========Code========//

#include<bits/stdc++.h>
using namespace std;

void Pattern14(int n){
    for(int i=0;i<n;i++){
        char ch = 65;
        for(int j=0;j<=i;j++){
            cout << ch;
            ch++;
        }
        cout << endl;
    }

}

int main(){
    int n;
    cin >> n;

    Pattern14(n);

    return 0;
}