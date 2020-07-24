#include<iostream>
#include<algorithm>
using namespace std;
int main(){
int n,i,gcd=0;
cin>>n;
int ar[n];
for(i=0;i<n;i++)
	cin>>ar[i];
gcd=ar[0];
for(i=1;i<n;i++){
  gcd=__gcd(gcd,ar[i]);     //inbuilt function to calculate gcd
}
for(i=0;i<n;i++){
	if(gcd==ar[i]){
	  cout<<ar[i];	
	  return 0;	
	}
}
cout<<-1;

return 0;	
}