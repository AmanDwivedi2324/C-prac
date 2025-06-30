#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int temp;
    int arr[n];
for(int j=0;j<n;j++){
    cin >> arr[j];
}
for(int i=0;i<n;i++){
     for(int j=i;j>=0;j--){
       if(arr[j]<arr[j-1]){
         temp = arr[j];
         arr[j] = arr[j-1];
         arr[j-1]=temp;
}
}
}
 for(int j=0;j<n;j++){
    cout << arr[j] << " ";
 }
}