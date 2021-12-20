#include<iostream>
using namespace std;
int main(){
long long int n,k,even,odd;
cin>>n>>k;
even=n/2;
if(n%2==0)
  odd=n/2;
else
  odd=n/2+1;
if(k<=odd){
  cout<<(2*k)-1; 
}
else{
  if(n%2==0)
    cout<<(2*k)-n;
   else
   	cout<<(2*k)-(n+1);
}

return 0;	
}