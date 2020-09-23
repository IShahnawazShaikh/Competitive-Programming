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

 int n,i;
 cin>>n;

 string s;
 cin>>s;
  int ans=0;
  int cnt=0;
 for(i=0;i<n;i++){
   if(s[i]=='1'){
      ans+=1;
      cnt+=1;
      ans+=cnt;
   }
 }
 cout<<ans-cnt<<endl;

}
return 0;	
}