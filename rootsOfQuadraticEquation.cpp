#include<bits/stdc++.h>
using namespace std;

int main(){
    int a,b,c;
    cin >> a >> b >> c;
    int d = (b*b)-(4*a*c);
    if(a==0){
        cout << "Roots are not possible";
    }
    else if(d==0){
        cout << "Roots are real and equal" << endl;
        cout << "Roots are : " <<(-b)/(2*a) ;
    }
    else if(d>0){
        cout << "Roots are real and different" << endl;
        cout << "Roots are : " << (-b + (sqrt(d)))/2*a << " and " << (-b - (sqrt(d)))/2*a;
    }
    else if(d<0){
        cout << "Roots are imaginary.";
    }
}