/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<set>
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
 int cnt=0;
 set<char> st;

 for(i=0;i<s.size()-1;i++){
   if(s[i]==s[i+1]){
     cnt+=1;
   }
   else{
   	 cnt+=1;
   	 if(cnt&1)
   	     st.insert(s[i]);
   	  cnt=0;
   }
 } 

 if(s[s.size()-1]!=s[s.size()-2])
 	 st.insert(s[s.size()-1]);
 if(cnt>1 && cnt&1^1)
 	 st.insert(s[s.size()-1]);

if(st.size()==0)
	 cout<<" ";
else{
 for(auto i: st)
	 cout<<i;
}
cout<<endl;	
}
return 0;	
}