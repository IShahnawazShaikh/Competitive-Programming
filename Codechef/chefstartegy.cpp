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
int n,i;
cin>>n;
vector<ll> v(n);
for(i=0;i<n;i++)cin>>v[i];

sort(v.begin(),v.end(),greater<int>());

ll first=0;
ll second=0;
for(i=0;i<n;i++){
  if(i==0)
  	first+=v[i];
  else if(i==1 || i==2)
  	second+=v[i];
  else if(i&1)
  	first+=v[i];
  else
  	second+=v[i];
}
if(first> second)
	cout<<"first"<<endl;
else if(second > first)
   cout<<"second"<<endl;
else
	cout<<"draw"<<endl;
}
return 0;	
}