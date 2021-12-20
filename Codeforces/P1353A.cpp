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

 ll n,m;
 cin>>n>>m;
 
 if(n==1) cout<<0<<endl;
 else if(n==2) cout<<m<<endl;
 else cout<<m*(n-1)<<endl;

}




return 0;	
}