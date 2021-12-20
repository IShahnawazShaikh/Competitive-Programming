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

 int n,i,k;
 cin>>n>>k;
 vector<int> v(n);

  for(auto &i : v)cin>>i;

  if(v[0]==0){
     cout<<1<<endl;
     continue;
   }
 // cout<<endl<<"v[0]"<<v[0];
  int rem=0;
   int ans=0;
  for(i=0;i<n;i++){
   
   if(rem+v[i]<k){
   	  ans=i+1;
   	  break;
   }
   else rem=(rem+v[i])-k;

  }	
 if(ans) cout<<ans<<endl;
 else cout<<n+(rem/k)+1<<endl;
}

return 0;	
}