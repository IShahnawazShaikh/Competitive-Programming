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

 int n,i,index=0;
 bool st=true;
 cin>>n;
 vector<int> v(n);
 for(i=0;i<n;i++){
   int x;
   cin>>x;
   v[i]=x;
   if(x==1 && st){
   	  index=i;
   	   st=false;
   }
}
int ans=0,zero=0;
for(i=index;i<n;i++){
  if(v[i]==1) {
  	 ans+=zero;
  	 zero=0;
  }
  else zero+=1;

}
cout<<ans<<endl;
}
return 0;	
}