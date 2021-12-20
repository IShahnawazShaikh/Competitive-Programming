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
 int n,i;
 cin>>n;
 int *ar=new int[n];
 for(i=0;i<n;i++){
 	int x;
 	cin>>x;
 	ar[i]=x;
}
string ans="EASY";
for(i=0;i<n;i++){
  if(ar[i]==1) { 
  	ans="HARD";
  	break;
  }	
}
cout<<ans;
return 0;	
}