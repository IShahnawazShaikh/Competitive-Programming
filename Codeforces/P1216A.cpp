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

int i,n;
cin>>n;
string s;
cin>>s;

int a=0,b=0;
int ans=0;
for(i=0;i<s.size()-1;i+=2){
  if(s[i]==s[i+1]){
    ans+=1;
    if(s[i]=='a')
    	s[i]='b';
    else
    	s[i]='a';
  }

}
cout<<ans<<endl;
cout<<s;
return 0;	
}