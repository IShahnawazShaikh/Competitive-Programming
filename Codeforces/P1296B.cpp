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
int n;
cin>>n;
int ans=0;
int spent;
while(n>=10){	
  spent=n-n%10;
  ans+=spent;
  n=(n%10)+(spent/10);
}	
cout<<ans+n<<endl;	
}
return 0;	
}