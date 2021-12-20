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
int n;
cin>>n;
if(n<= 30)
   cout<<"NO"<<endl;
else{
cout<<"YES"<<endl;	
if(n==36 || n==40 || n==44)
	cout<<"6 10 15 "<<n-31<<endl;
else
	cout<<"6 10 14 "<<n-30<<endl;
}
	
}
return 0;	
}