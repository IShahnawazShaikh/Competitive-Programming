/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
ll int a,b;
cin>>a>>b;
ll int large;
ll int small;
if(a!=b){
 large=(a > b) ? a: b;
 if(large==a)
 	small=b;
 else
 	small=a;
}
else{
  large=a;
  small=b;
}
ll int i;
a=1;
for(i=large;i>=2;i--){
  if(i<= small)
     a*=i;
}
cout<<a;

 return 0;	
}