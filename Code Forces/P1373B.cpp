/*
    ************
*/
#include<iostream>
#include<vector>
#define int int64_t
using namespace std;
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int t,i;
 cin>>t;
 while(t>0){
 string s;
 int zeroes=0,ones=0,m;
 cin>>s;
 for(i=0;i<s.length();i++){
 	if(s[i]=='0')
 		zeroes++;
 	else
 		ones++;
 }
   m=min(zeroes,ones);
   if(m%2==0)
     cout<<"NET";
   else
    cout<<"DA";
 cout<<endl;	
 t--;
 }
 return 0;	
}