#include<iostream>
#include<vector>
#include<map>
#include<cmath>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
string s;
cin>>s;

int res=0,i;
int mod=1000003;
for(i=0;i<s.size();i++){
	res*=16;
	if(s[i]=='>') res=(res+8)%mod;
	else if(s[i]=='<') res=(res+9)%mod;
	else if(s[i]=='+') res=(res+10)%mod;
	else if(s[i]=='-') res=(res+11)%mod;
	else if(s[i]=='.') res=(res+12)%mod;
	else if(s[i]==',') res=(res+13)%mod;
	else if(s[i]=='[') res=(res+14)%mod;
	else res=(res+15)%mod;
}
cout<<res%mod;



return 0;	
}