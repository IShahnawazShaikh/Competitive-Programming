/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n,i;
cin>>n;
vector<ll> v(n);
bool st=false;
for(i=0;i<n;i++){
	cin>>v[i];
	if(v[i]==0)
		st=true;
 }
sort(v.begin(),v.end(),greater<int>());
int ans=0;
  
for(i=0;i<n-1;i++){
   if(v[i]!=v[i+1])
       ans+=1;	
}
if(st) cout<<ans<<endl;
else  cout<<ans+1<<endl;
}
return 0;	
}