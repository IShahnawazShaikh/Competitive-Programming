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
int i;
int n;
cin>>n;
vector<int>v(n);
for(i=0;i<n;i++)cin>>v[i];
int ans=0;
for(auto i: v){
	if(i==1)
		 ans=!ans;
	else{
	  ans=!ans;
	  break;	
	}
}
if(ans==1)
	cout<<"First"<<endl;
else
  cout<<"Second"<<endl;	
}
return 0;	
}