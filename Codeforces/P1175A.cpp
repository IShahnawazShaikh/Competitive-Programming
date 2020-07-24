/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
ll int n,k,moves=0;
cin>>n>>k;
while(n!=0){
 if(n%k==0){
   moves+=1;
   n/=k;
}
 else{
 	moves+=n%k;
 	n-=(n%k);
  }
}
cout<<moves;
cout<<endl;	
}
 return 0;	
}