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
int i;
int a,b,n,s;
cin>>a>>b>>n>>s;

 int t=s/n;
 int mn=min(a,t);
 if(s-mn*n <=b)
    cout<<"YES"<<endl;
 else
    cout<<"NO"<<endl;
}
return 0;	
}