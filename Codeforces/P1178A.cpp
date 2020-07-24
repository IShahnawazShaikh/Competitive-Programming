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
int n;
cin>>n;
int i;
vector<int> v(n);
int t_seats=0;
for(i=0;i<n;i++){
	cin>>v[i];
	t_seats+=v[i];
}
int st=0;
vector<int> k;
if(v[0] > t_seats/2){
	cout<<1<<endl;
	cout<<1;
}
else{
	 int alice=v[0];
	 k.push_back(1);
     for(i=1;i<n;i++){
      
      if(v[0]>=v[i]*2){
        alice+=v[i];
        k.push_back(i+1);
        if(alice > t_seats/2){
         st=1;
         break;
        }
      }
     }
   if(st){
   cout<<k.size()<<endl;
   for(auto val: k)
    cout<<val<<" ";	
  }
 else
  cout<<0;
}
return 0;	
}