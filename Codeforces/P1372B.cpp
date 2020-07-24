/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<cmath>
#include <map>
#include <algorithm>
// #define int int64_t
using namespace std;
#define ll  long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
ll int n,i;
cin>>n;
if(n&1^1)
	cout<<n/2<<" "<<n/2<<endl;
else{
int st=1;
for(i=2;i*i<=n;i++){
    if(n%i==0){
    	cout<<n/i<<" "<<n-(n/i)<<endl;
    	st=0;
    	break;
    } 
 }
 if(st)
    cout<<1<<" "<<n-1<<endl;
 }
 }
return 0; 
}
