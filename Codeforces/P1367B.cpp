/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
  
  Question link: https://codeforces.com/contest/1367/problem/B

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
int n,i;
cin>>n;
vector<int> v(n);
int odd=0;
int even=0;
for(i=0;i<n;i++){
	cin>>v[i];
	if(v[i]%2!=i%2)
		if(i&1)
			odd+=1;
		else
			even+=1;
   } 
 if(odd!=even)
    cout<<-1<<endl;
 else
   cout<<odd<<endl;       
}
return 0;	
}