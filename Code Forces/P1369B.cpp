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
int t,i;
cin>>t;
while(t--){
string s;
int n,i;
cin>>n;
cin>>s;	 
string zeroes="";
string ones="";
for(i=0;i<n;i++){
   if(s[i]=='0')
      zeroes+=s[i];
   else
     break;   	
}
for(i=n-1;i>=0;i--){
   if(s[i]=='1')
      ones+=s[i];
   else
     break;   	
}
if(ones.length()+zeroes.length()==n)
	 cout<<s;
else
  cout<<zeroes+'0'+ones;	
  cout<<endl;	
 }
 return 0;	
}