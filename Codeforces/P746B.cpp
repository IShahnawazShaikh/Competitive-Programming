/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
  
  Question link: https://codeforces.com/contest/746/problem/B
*/


#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,i;
cin>>n;
string s;
cin>>s;

string ans="";
ans=ans+s[0];

bool st=true;
if((n-1)&1){
  st=false;
}
for(i=1;i<n;i++){
 if(st){
    ans=s[i]+ans;
    st=false;
 }
 else{
 	ans=ans+s[i];
 	st=true;
 }
}
cout<<ans;
return 0;	
}