/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<map>
using namespace std;
#define F first
#define S second
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int i,n;
cin>>n;
map<int,int> m;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
for(i=0;i<n;i++){
	m[v[i]]++;
}
int ans=0;	
for(auto i: m){
	// cout<<endl<<i.F<<" "<<i.S;
  // if(i.second>1)
  // 	ans+=i.second-1;
  if(i.F>n)
  	ans+=i.S;
  else if(i.S>1)
  	ans+=i.S-1;


}
cout<<ans;	
 return 0;	
}