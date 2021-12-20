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
int t,i;
cin>>t;
while(t--){
 string S;
 string T;
 cin>>S;
 cin>>T; 
 string result=S+T;
 sort(result.begin(),result.end());
 for(i=0;i<S.length();i++)
 	cout<<result[i];	 
  cout<<endl;	
 }
 return 0;	
}