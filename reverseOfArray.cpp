#include<bits/stdc++.h>
using namespace std;

int main(){
    int n ;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int arr2[n];
    int start=0;
    int end=n-1;
    for(int i=0;i<n;i++){
        arr2[start]=arr[end];
        cout << arr2[start] << " ";
        start++;
        end--;
    }

}