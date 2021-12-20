/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<map>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
 string s;
 cin>>s;
 int i;
 map<char,int>m;
 bool odd=false;
 if(s.size()&1)
 	odd=true;

 for(i=0;i<s.size()/2;i++){
    m[s[i]]++;
 }
  bool ans=false;
 i=(odd)?s.size()/2+1:s.size()/2;
 for(i=i;i<s.size();i++){
    if(m[s[i]]==0)
    	 ans=true;
    else
      m[s[i]]--;
 }
(ans)? cout<<"NO"<<endl: cout<<"YES"<<endl;


}

return 0;	
}