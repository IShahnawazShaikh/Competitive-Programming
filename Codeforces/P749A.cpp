/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,i,ans;
cin>>n;
cout<<n/2<<endl;
if(n&1^1){
 for(i=1;i<=n/2;i++)
 	cout<<2<<" ";
 }
else{
 for(i=1;i<=n/2-1;i++)
 	cout<<2<<" ";
 cout<<3;
}
return 0;	
}