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
int t;
cin>>t;
while(t--){
int a,b;
cin>>a>>b;
if(a%b==0){
	cout<<0;
}
else{
	int q=a/b;
    cout<<b*(q+1)-a;
}
cout<<endl;	
 }
 return 0;	
}