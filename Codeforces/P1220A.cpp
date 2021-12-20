/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________

    link https://codeforces.com/problemset/problem/1220/A
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	

int i,n;
cin>>n;
string s;
cin>>s;
int one=0,zero=0;
for(i=0;i<n;i++){
  if(s[i]=='n')
  	one+=1;
  else if(s[i]=='r')
  	zero+=1;
}
for(i=0;i<one;i++)
	cout<<1<<" ";
for(i=0;i<zero;i++)
   cout<<0<<" ";
return 0;	
}