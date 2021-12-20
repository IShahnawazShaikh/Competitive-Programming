/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
 
  Question link : https://codeforces.com/contest/801/problem/B 
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
string x,y;
cin>>x>>y;
int i;
string z="";
for(i=0;i<x.size();i++){
	if(x[i]>=y[i])
     z=z+y[i];
	else{
		z="-1";
		break;
	}
}
cout<<z;
return 0;	
}