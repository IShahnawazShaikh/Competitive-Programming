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
int n,k;
cin>>n>>k;	
int Tot_time=240-k;
int i=1;
int ans=0;
while(i<=n){
ans+=5*i;
if(ans<= Tot_time)
	i++;
else
	break;
}
cout<<i-1;


return 0;	
}