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
int i,n,m;
cin>>n>>m;
vector<string> s(n);
vector<string> t(m);
for(i=0;i<n;i++)cin>>s[i];
for(i=0;i<m;i++) cin>>t[i];

int q;
cin>>q;
while(q--){
long long y;
cin>>y;
int s_index=y%s.size();
int t_index=y%t.size();
if(s_index!=0 && t_index!=0)
	cout<<s[s_index-1]+t[t_index-1]<<endl;
else{
  if(s_index==0 && t_index==0)
	cout<<s[s.size()-1]+t[t.size()-1]<<endl;
 else if(s_index==0)
	cout<<s[s.size()-1]+t[t_index-1]<<endl;
  else
	cout<<s[s_index-1]+t[t.size()-1]<<endl;
  	
}




}
return 0;	
}