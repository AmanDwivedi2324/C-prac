#include<bits/stdc++.h>
using namespace std;

int main(){
    long n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int a=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=arr[i+1]){
            cout << arr[i] << " "; 
            a++;
        }
    }
    cout << endl << a ;
}