/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/
#include<iostream>
#include<cmath>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
 ll int n;
 ll int moves=0;
 cin>>n;
 if(n==1)
 	moves=0;
 else{
 while(n!=1){
   moves+=1;
   if(n==2 | n>1000000000){
 	moves=-1;
 	break;
   }
   else if(n%6==0)
      n/=6;
   else
       n*=2;
  }
 }
 cout<<moves;
 cout<<endl;	
}
 return 0;	
}