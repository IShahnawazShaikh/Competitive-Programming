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
int n;
cin>>n;

if(n>=0)
	cout<<n;
else{
   
    if(n==-10)
       cout<<0;	 
    else{

	 int x=n%10;
	 int temp=n/10;
	 int y=temp%10;
     // cout<<endl<<x<<" "<<y<<endl;
	 if(y<x){
        n/=10;
        n=n+abs(x-y);
        cout<<n;
	 }
	 else
	 	cout<<n/10;
    }
}
return 0;	
}