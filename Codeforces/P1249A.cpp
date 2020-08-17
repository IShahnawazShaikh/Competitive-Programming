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
int n,i;
cin>>n;
vector<int> v(n);
int ans=1;
for(i=0;i<n;i++)cin>>v[i];
sort(v.begin(),v.end());

for(i=0;i<n-1;i++){
 if(v[i+1]-v[i]==1){
 	ans=2;
 	break;
 }
}
cout<<ans<<endl;	
}
return 0;	
}