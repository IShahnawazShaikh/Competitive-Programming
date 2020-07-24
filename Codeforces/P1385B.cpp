/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
#include<map>
using namespace std;
#define int int64_t
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int i;
int n;
cin>>n;
vector<int>v(2*n);
map <int,int> m;
for(i=0;i<2*n;i++){
	cin>>v[i];
}
vector<int> v2;
for(auto val: v){
  m[val]++;
  if(m[val]==1){
  	 v2.push_back(val);
  }
}
for(auto val: v2)
  cout<<val<<" ";
		 
cout<<endl;	
}
return 0;	
}