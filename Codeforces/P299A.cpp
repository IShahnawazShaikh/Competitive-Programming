/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
  
                Question Link: https://codeforces.com/contest/299/problem/A
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,i,j;
cin>>n;
vector<int> v(n);
int ones=0;
for(auto &i: v){
	cin>>i;
    if(i==1)ones+=1;
}
if(n==1){
   cout<<v[0];
   return 0;
}
if(ones>=1){
	cout<<1;
	return 0;
}
int ans=__gcd(v[0],v[1]);
for(i=2;i<n;i++)
  ans=__gcd(v[i],ans);

sort(v.begin(),v.end());
if(binary_search(v.begin(),v.end(),ans))
  cout<<ans;
else
   cout<<-1;
return 0;	
}
