/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
//#define int int64_t
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n;
cin>>n;
while(n--){
ll int a;
ll int b;
ll int gr;
ll int sm;
ll int ans=0;
cin>>a>>b;
if(a-b > 0){
  gr=a;
  sm=b;
}
else{
   gr=b;
   sm=a;
 }
while(gr!=0 && sm!=0){
ans+=gr/sm;
gr=((gr%sm)+sm)-(sm=gr%sm);
}
cout<<ans<<endl;
}

return 0;	
}


//Question Link : https://codeforces.com/problemset/problem/267/A