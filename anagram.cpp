#include<bits/stdc++.h>
using namespace std;

   // function
 bool anagram(string s1,string s2){
    int n1=s1.length();            //for length of string
    int n2=s2.length();
    if(n1!=n2)
    {
        return false;
    }
    sort(s1.begin(),s1.end());             //for sorting
    sort(s2.begin(),s2.end());

    for(int i=0;i<n1;i++){
        if(s1[i]!=s2[i]){
            return false;
        }
        else return true;
    }
    }

    int main(){
    string s1,s2;
    cin >> s1 >> s2;
     if(anagram(s1,s2))            //function call
     {
        cout << "Given strings are anagram.";  
        }             
    else 
    {
        cout << "Given strings are not anagram.";
    }
    return 0;
    
}