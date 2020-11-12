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


int i,n,h;
cin>>n>>h;
int ans=0;
for(i=0;i<n;i++){
	int x;
	cin>>x;
	if(x>h) ans+=2;
	else ans+=1;
}

cout<<ans;

return 0;	
}