#include<bits/stdc++.h>
using namespace std;

int main(){
    int p,q,gcd;
    cin >> p >> q;
    for(int i=1;i<=p and i<=q;i++){
        if(p%i==0 and q%i==0){
            gcd=i;
        }
    }
    cout << gcd;
}