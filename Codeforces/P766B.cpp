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
int i,n;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
sort(v.begin(),v.end());
bool b=false;
for(i=2;i<n;i++){
	if(v[i-1]+v[i-2]>v[i]){
		b=true;
		break; 
	}
}	
if(b)
	cout<<"YES";
else
	cout<<"NO";
return 0;	
}