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
int t;
cin>>t;
while(t--){
string s;
cin>>s;
vector<int> v;
int i,cnt=0;

for(i=0;i<s.length();i++){
	if(s[i]=='1')
		cnt+=1;
	else{
		v.push_back(cnt);
		cnt=0;
	}
}
if(cnt!=0)
	v.push_back(cnt);


sort(v.begin(),v.end(),greater<int>());

cnt=0;
for(i=0;i<v.size();i+=2)
    cnt+=v[i];
  
cout<<cnt<<endl;
}
return 0;	
}