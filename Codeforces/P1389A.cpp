/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
   
Question link: https://codeforces.com/contest/1389/problem/A
   
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
 ll int l,r;
 cin>>l>>r;
  if((l*r)/__gcd(l,r) <=r){
    cout<<l<<" "<<r;
  }
  else{
    ll int i,j;
    int st=0;
      for(j=l*2;j<=r;j++){
          if((l*j)/__gcd(l,j)<=r){
          	 cout<<l<<" "<<j;
          	 st=1;
          	 break;
          }
      } 
   if(!st) 
   cout<<-1<<" "<<-1;
    }

cout<<endl;	
}
return 0;	
}