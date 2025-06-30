#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int a = 0;
    int b = 1;
    int nextTerm;
    cout << a << "," << b << ",";
    for(int i=2;i<n;i++){
        nextTerm = a+b;
        a=b;
        b=nextTerm;
        cout << nextTerm << ",";
    }
}