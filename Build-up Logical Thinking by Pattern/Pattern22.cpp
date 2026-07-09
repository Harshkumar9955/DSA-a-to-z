//=========Problem===========//

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5


//===========Code==========//

//hint

//A good hint is to forget about layers first and think about the distance of each cell from the four borders.

// For every position (i, j):
                                          
// Distance from top = i                       
// Distance from left = j
// Distance from bottom = size - 1 - i
// Distance from right = size - 1 - j


// 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 0 
// 0 1 2 2 2 2 2 1 0 
// 0 1 2 3 3 3 2 1 0 
// 0 1 2 3 4 3 2 1 0 
// 0 1 2 3 3 3 2 1 0 
// 0 1 2 2 2 2 2 1 0 
// 0 1 1 1 1 1 1 1 0 
// 0 0 0 0 0 0 0 0 0

#include<bits/stdc++.h>
using namespace std;

void Pattern22(int n){
    for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
            int top=i;            
            int left=j;            
            int bottom = (2*n-1)-1-i;
            int right = (2*n-1)-1-j;
            cout << (n-min(min(top,bottom),min(left,right)));
            if (j != 2 * n - 2){
                cout << " ";
            }
            
        }
        cout << endl;

    }

}

int main(){
    int n;
    cin >> n;

    Pattern22(n);

    return 0;
}