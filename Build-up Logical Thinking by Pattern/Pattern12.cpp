//========Problem=======//
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

//==========Code==========//

#include<bits/stdc++.h>
using namespace std;

void Pattern12(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout << j+1;
        }
        for(int j=0;j<2*(n-i-1);j++){
            cout << " ";
        }
        for(int j=i;j>=0;j--){
            cout << j+1;
        }
    
        
        cout << endl;
    }
    
    
}

int main(){
    int n;
    cin>>n;

    Pattern12(n);

    return 0;
}