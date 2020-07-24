/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
using namespace std;
#define ll  long long
#define mod 1000000007
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
ll int t;
cin>>t;
while(t--){
	 
string s;
cin>>s;
ll int freq=1;
ll int i;
ll int ans=1;
ll int n=s.size();
for(i=0;i<n-1;i++){
   if(s[i]==s[i+1])
   	freq+=1;
   else{
   	 ans=((ans%mod)*((freq*3-freq*2)+1))%mod;
   	 freq=1;
   }
}
ans=((ans%mod)*((freq*3-freq*2)+1))%mod;
cout<<ans%mod<<endl;
}	
 return 0;	
}