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

int x,n,i;
cin>>x>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];

sort(v.begin(),v.end());

int prev=0,frwd=0;
prev=x;
while(binary_search(v.begin(),v.end(),prev))prev-=1;	
frwd=x;
while(binary_search(v.begin(),v.end(),frwd))frwd+=1;

if((x-prev)<=frwd-x)
    cout<<prev;
else
   cout<<frwd;    	

return 0;	
}