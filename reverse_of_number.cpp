#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int rev=0;
    int lastNumber;
    while(n!=0){
        lastNumber = n%10;
        rev = rev*10 + lastNumber;
        n = n/10;
    }
    cout << "Reverse is " << rev;
}