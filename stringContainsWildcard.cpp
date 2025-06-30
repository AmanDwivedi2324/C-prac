#include<bits/stdc++.h>
using namespace std;

int main(){
    string s1,s2;
    getline(cin,s1);
    getline(cin,s2);
    int n1=s1.length();
    int n2=s2.length();
    for(int i=n2;i>n2-2;i--){
        if(s1[i]==s2[i]){
            cout << "MATCH";
            break;
        }
        else cout << "NOT MATCH";
        break;
    }

}