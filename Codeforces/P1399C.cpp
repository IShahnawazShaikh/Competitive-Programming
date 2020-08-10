/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<map>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n,i,j;
cin>>n;

map<int,int> m;
for(i=0;i<n;i++){
  int temp;
  cin>>temp;
  m[temp]++;
}
int ans=0;

for(i=2;i<=2*n;i++){
 int total=0;
 for(auto j: m){
  int oth=i-j.first;
  if(oth>=1 && m.count(oth)){
  	  total+=min(j.second,m[oth]);
  }
 }
 total/=2;
 ans=max(ans,total);
}

cout<<ans<<endl;
}
return 0;	
}