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
int n,i;
cin>>n;
string s;
cin>>s;

map<int,int> m;
m[0]=1;
int sum=0;
int ans=0;
for(i=0;i<n;i++){
   int x=s[i]-'0';
   x--;
   sum+=x;
   ans+=m[sum];
   m[sum]++;
}
cout<<ans<<endl;	
}
return 0;	
}