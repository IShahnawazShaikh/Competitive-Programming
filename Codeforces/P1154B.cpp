/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
  
  Question link: https://codeforces.com/problemset/problem/1154/B

*/



#include<iostream>
#include<vector>
#include<set>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);
int n;
cin>>n;

vector<int> v(n);
int i;
for(i=0;i<n;i++)cin>>v[i]; 
set<int> s;
for(i=0;i<n;i++)
  s.insert(v[i]);


if(s.size()>3)
	 cout<<-1;
else {
 v.clear();
for(auto i: s)
   v.push_back(i);

 if(s.size()==3){

if(v[2]-v[1]==v[1]-v[0])
	cout<<v[2]-v[1];
else
	cout<<-1;
}
else if(s.size()==2){
	if((v[1]-v[0])&1^1)
		cout<<(v[1]-v[0])/2;
	else
		cout<<v[1]-v[0];
}
else
	cout<<0;
}
return 0;	
}