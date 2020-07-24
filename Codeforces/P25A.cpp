/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n;
int i;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
int odd=0;
int oddI=-1;
int even=0;
int evenI=-1;
for(i=0;i<n;i++){
   if(v[i]&1){
     odd+=1;
     oddI=i;
   }
   else{
     even+=1;
     evenI=i;
   }
} 
if(odd==1)
 cout<<oddI+1;	
else
  cout<<evenI+1;	
 return 0;	

}