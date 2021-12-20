/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<map>
#include<algorithm>
#define F first 
#define S second
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n,k;
cin>>n>>k;
vector<int> v;
int i;
int cnt=0;
for(i=0;i<n;i++){
	int x;
	cin>>x;
	v.push_back(x);	 
 }
for(i=0;i<n;i++){
	if(v[i]%k==0)
	  cnt+=1;
	else
	  break;  	 
} 
if(cnt==n){
   cout<<0;
} 
else{
	map<int,int> m;
 for(i=0;i<n;i++){
	if(v[i]%k!=0){
        int rem=v[i]%k;
        int req=k-rem;
		m[req]++;
	}	 
 }
int x;
while(m.size()!=0){	
auto it=m.begin();
x=it->first;
if(it->second==1){	
  m.erase(it);
} 
else if(it->second>1){
     int p=it->first;	
	int q=it->second;
	m[p+k]=--q;
   m.erase(it);
 }
}
cout<<x+1;
}
cout<<endl; 
}
 return 0;	
}