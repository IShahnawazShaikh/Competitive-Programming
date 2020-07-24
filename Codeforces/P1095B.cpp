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
int n,i;
cin>>n;
vector<int>v(n);
for(i=0;i<n;i++)cin>>v[i];

sort(v.begin(),v.end());

int a=v[v.size()-1]-v[1];
int b=v[v.size()-2]-v[0];

cout<<min(a,b);




return 0;	
}



//link https://codeforces.com/problemset/problem/1095/B?f0a28=1