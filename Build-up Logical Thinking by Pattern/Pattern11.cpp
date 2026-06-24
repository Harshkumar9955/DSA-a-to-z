//=========Problem========//
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1


//==========Code===========//

#include<bits/stdc++.h>
using namespace std;

void Pattern11(int n){
    for(int i=0;i<n;i++){
        int start = (i%2==0) ? 1 : 0;
        for(int j=0;j<=i;j++){
            cout << start;
            if(j<i){
                cout << " ";
            }
            start = 1-start;
        }
        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;

    Pattern11(n);

    return 0;
}