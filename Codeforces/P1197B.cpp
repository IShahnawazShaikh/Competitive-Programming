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
int i,n;
cin>>n;
vector<int> v;
int greatest=0;
int k;
for(i=0;i<n;i++){
	int temp;
	cin>>temp;
	v.push_back(temp);
	if(greatest<temp){
		greatest=temp;
		k=i;
	}
}
bool status=true;
for(i=0;i<k-1;i++){	
   if(v[i]>v[i+1]){
   	 status=false;
   	 break;
   }
}
if(status){
   for(i=k+1;i<n-1;i++){	
   if(v[i] < v[i+1]){
   	 status=false;
   	 break;
   }
 }
}
if(status)
  cout<<"YES";
else
  cout<<"NO";  	 
return 0;	
}

//link : https://codeforces.com/contest/1197/problem/B