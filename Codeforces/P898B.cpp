/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________

 Question link : https://codeforces.com/problemset/problem/898/B
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
ll int a,b,c;
cin>>a>>b>>c;
ll int i=1;
if(a%b==0){
  cout<<"YES"<<endl;
  cout<<a/b<<" "<<0;
  return 0;	
}
if(a%c==0){
  cout<<"YES"<<endl;
  cout<<0<<" "<<a/c;
  return 0;	
}
while(true){
 if(a-(b*i)<0){
 	i=0;
 	cout<<"NO";
 	break;
  }
 if((a-(b*i))%c==0)
 	break;
 i+=1;
}
if(i){
  cout<<"YES"<<endl; 
   cout<<i<<" "<<(a-b*i)/c;
}
return 0;	
}