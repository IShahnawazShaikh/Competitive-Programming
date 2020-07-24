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
int t;
cin>>t;
while(t--){	
int n;
cin>>n;
if(n==1 | n==2)
	cout<<1;
else{
	if(n%2==0)
		cout<<n/2;
	else
		cout<<n/2+1;

 }
cout<<endl; 
}
return 0;	
}