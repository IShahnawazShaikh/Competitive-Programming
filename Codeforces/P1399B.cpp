/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
    Question link : https://codeforces.com/contest/1399/problem/B
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
vector<int> a(n);
vector<int> b(n);
for(i=0;i<n;i++)cin>>a[i];
for(i=0;i<n;i++)cin>>b[i];


int mn1=*min_element(a.begin(),a.end());
int mn2=*min_element(b.begin(),b.end());
int ans=0;
for(i=0;i<n;i++){
 ans+=max(a[i]-mn1,b[i]-mn2);
}

cout<<ans<<endl;	
}
return 0;	
}