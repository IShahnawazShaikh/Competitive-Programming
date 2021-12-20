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

 int n,k,x,y;
 cin>>n>>k>>x>>y;
 
 int cnt=1;
 int rem;
 string ans="NO";
 rem=(x+k)%n;
 while(cnt <= n){
 if(rem==y){
   ans="YES";
   break;
 }
 else
   rem=(rem+k)%n;
 cnt+=1;
 }
cout<<ans<<endl; 
}
return 0;	
}