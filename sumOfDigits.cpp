#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int ld;
    int sum=0;
    while(n!=0){
         ld = n%10;
         sum = sum + ld;
         n = n/10;
    }
    cout << sum;
}