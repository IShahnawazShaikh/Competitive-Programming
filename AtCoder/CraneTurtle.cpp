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
int x,y,i;
cin>>x>>y;

vector<int>v;

for(i=0;i<=x;i++)
 v.push_back(i*4+(x-i)*2);

sort(v.begin(),v.end());

if(binary_search(v.begin(),v.end(),y))
	cout<<"Yes";
else
  cout<<"No";



return 0;	
}