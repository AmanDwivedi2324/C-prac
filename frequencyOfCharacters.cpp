#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    getline(cin,s);
    char c;
    cin >> c;
    int sum=0;
    int n=s.length();
    for(int i=0;i<n;i++){
        if(s[i]==c){
            sum++;
        }
    }
    cout << sum;
}