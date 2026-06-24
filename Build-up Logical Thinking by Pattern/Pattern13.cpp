//=======Problem=======//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

//=========Code========//

#include<bits/stdc++.h>
using namespace std;

void Pattern13(int n){
    int num = 1;
    for(int i=0;i<n;i++){ 
        for(int j=0;j<=i;j++){
            cout << num;
            num++;
            if(j<i){
                cout << " ";
            }
        }
        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;

    Pattern13(n);

    return 0;
}