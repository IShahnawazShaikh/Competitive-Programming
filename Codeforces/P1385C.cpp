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
int i;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i]; 
int pos=v.size()-1;

while(pos > 0 && v[pos-1]>=v[pos])--pos;
while(pos > 0 && v[pos-1]<=v[pos])--pos;
cout<<pos<<endl;	
}
return 0;	
}