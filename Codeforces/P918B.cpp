// Question link : https://codeforces.com/problemset/problem/918/B

#include<iostream>
#include<string>
#include<vector>
#include<map>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,m;
cin>>n;
cin>>m;
map<string,string> mp;
while(n--){
  string s,ip;
  cin>>s>>ip;
  mp.insert({ip,s});
}
// for(auto i: mp)
// 	cout<<i.first<<" "<<i.second<<endl;

int i;
for(i=0;i<m;i++){
	string s1,s2;
	cin>>s1>>s2;
    cout<<s1<<" "<<s2<<" #"<<mp[s2.substr(0,s2.length()-1)]<<endl;
}


return 0;	
}