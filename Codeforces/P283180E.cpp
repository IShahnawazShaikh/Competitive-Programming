#include<iostream>
#include<vector>
using namespace std;
int main(){
long long int ans=1;
int n,m,i,j;
cin>>n>>m;
vector<long long int> v(n);
if(n>m){
	cout<<0<<endl;
}
else{
	for(i=0;i<n;i++)cin>>v[i];
   for(i=0;i<n;i++){
   	  for(j=i+1;j<n;j++){
   	  	 ans=ans*abs(v[i]-v[j]);
   	  	 ans=ans%m;
   	  }
   }
   cout<<ans%m;
}


return 0;	
}