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
vector<int> v(5);
int i;
for(i=0;i<5;i++)cin>>v[i];

for(i=0;i<5;i++){
   if(v[i]==0){
     cout<<i+1;
     break;
   }
}
return 0;	
}