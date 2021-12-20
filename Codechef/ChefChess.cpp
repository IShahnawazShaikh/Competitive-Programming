/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n;
ll int k;
cin>>n>>k;

//vector<ll int> v;
int i;
ll int mn=1e9;
ll int ans=0;
for(i=0;i<n;i++){
	ll int temp;
	cin>>temp;
	if(k%temp==0){
		if(mn > k/temp-1){
			mn=k/temp-1;
			ans=temp;
		}
	}
		
}
if(ans)
	cout<<ans<<endl;
else
	cout<<-1<<endl;
}
return 0;	
}