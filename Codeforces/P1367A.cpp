/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
   Question Link : https://codeforces.com/contest/1367/problem/A

*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t,i;
cin>>t;
while(t--){
string b;
cin>>b;
string a="";

a=a+b[0];
for(i=1;i<b.length()-1;i+=2)
	 a=a+b[i];

cout<<a+b[b.length()-1]<<endl;	
}
return 0;	
}