#include<bits/stdc++.h>
using namespace std;

void pf(int a)
{
    while(a%2==0)
    {
        cout << 2 << " ";
        a=a/2;
    }
    for(int i=0;i<sqrt(a);i=i+2){
        while(a%i==0){
            cout << i << " ";
            a = a/i;
        }
    }
    if(a>2){
        cout << a;
    }
}

int main()
{
    int n;
    cin >> n;
    pf(n);
    return 0;
    
}