/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<map>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,m;
cin>>n>>m;
map<string,string> mp;
while(m--){
	string ai,bi;
	cin>>ai>>bi;
	mp[ai]=bi;
}
string ans="";
while(n--){
	string s;
	cin>>s;
	ans+=(s.size()<=mp[s].size()) ? s+" " : mp[s]+" "; 
}
cout<<ans;

return 0;	
}