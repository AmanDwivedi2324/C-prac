#include<bits/stdc++.h>
using namespace std;

int main()
{
    int num;
    int temp=0;
    cin >> num;
    for(int i=1;i<num;i++){
        if(num%i==0){
            temp = temp + i;
        }
    }
   if(temp==num) cout << "Perfect Number";
   else cout << "Non-Perfect Number";
}