/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int i,j;
int n,m;
cin>>n>>m;
vector<int> a(n);
vector<int> b(m);

for(i=0;i<n;i++)cin>>a[i];
for(i=0;i<m;i++)cin>>b[i];

sort(a.begin(),a.end());	
sort(b.begin(),b.end(),greater<int>());

int ans=1;
int st=0;
int st2=1;
for(i=0;i<n;i++){
  for(j=0;j<m;j++){
    if(a[i]==b[j]){
     ans=a[i];	
     st=1;
     break;
    }

   }
 if(st){
 	  st2=0;
 	 break;
 }
}	
if(st2){
	cout<<"NO"<<endl;
}
else{
	cout<<"YES"<<endl;
     cout<<1<<" "<<ans<<endl;
 }
}
return 0;	
}