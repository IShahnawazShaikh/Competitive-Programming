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

 int n,x;
 cin>>n>>x;
 vector<int> a(n);
 vector<int> b(n);
 for(auto &i: a) cin>>i;
 for(auto &i: b) cin>>i;

 sort(b.begin(),b.end(),greater<int>());	
 string ans="Yes";
 for(int i=0;i<a.size();i++){
 if(b[i]+a[i]>x) {
  ans="No";
  break;
 } 	 
}
cout<<ans<<endl;
}

return 0;	
}