#include<iostream>
#include<algorithm>
using namespace std;
int main(){
int i;
int n;
cin>>n;
int *ar=new int[n];
for(i=0;i<n;i++) cin>>ar[i];
int pos=1;
sort(ar,ar+n);
for(i=0;i<n;i++){
  if(ar[i]>=pos) pos+=1;
}
cout<<pos-1;

return 0;
}