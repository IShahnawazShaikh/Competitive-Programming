/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,i;
cin>>n;
string s;
cin>>s;
int ans=0;
for(i=0;i<n;i++){
  if((s[i]-'0')&1^1)
  	ans+=(i+1);
}
cout<<ans;
 return 0;	
}