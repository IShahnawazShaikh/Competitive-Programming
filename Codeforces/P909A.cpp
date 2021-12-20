/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
   
    Question link: https://codeforces.com/contest/909/problem/A
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
string a,b;

cin>>a>>b;
string ans="";
ans+=a[0];
int i;
for(i=1;i<a.size();i++){
  if(a[i]<b[0])ans+=a[i];
  else break;
}
cout<<ans+b[0];
return 0;	
}