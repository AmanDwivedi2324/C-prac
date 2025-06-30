// palindrome is same either read from left to right or from right to 
#include<bits/stdc++.h>
using namespace std;

string isPalindrome(string s){               //function formation
    string p=s;
    reverse(p.begin(),p.end());
    if(s==p){
        return "yes";
    }
    else return "no";
    }

int main(){
    string s;
    cin >> s;
    cout << isPalindrome(s);                    //function call
    return 0;
}