#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n;
cin>>n;
string ans="";
int i,a=0,b=1;
for(i=1;i<=n;i++){
	if(i==a+b){
		 ans=ans+"O";
		 int t=a;
		 a=b;
		 b=i;
	}
	else
		ans=ans+"o";
}
cout<<ans;
return 0;	
}