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
int h,p;
cin>>h>>p;

if(p>=h){
  cout<<1<<endl;
  continue;
}
else if(h/2>=p || h/2+1==p && p&1)
	 cout<<0<<endl;
else
	cout<<1<<endl;
}
return 0;	
}