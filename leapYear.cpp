#include<bits/stdc++.h>
using namespace std;

int main(){
    // leap year is that year which is completely divisible by 4 and in case of century year,divisible by 400 and not divisible by 100
    int year;
    cin >> year;
    if(year%400==0){
        cout << "LEAP YEAR";
    }
    else if(year%4==0 and year%100!=0){
        cout << "LEAP YEAR";

    }
    else cout << "NOT LEAP YEAR";
}