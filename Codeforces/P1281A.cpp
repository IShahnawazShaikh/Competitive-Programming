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

if(s[s.size()-1]=='o')
	cout<<"FILIPINO"<<endl;
else if(s[s.size()-1]=='u')
	cout<<"JAPANESE"<<endl;
else
	cout<<"KOREAN"<<endl;
}
return 0;	
}