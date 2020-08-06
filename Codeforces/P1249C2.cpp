/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
  Question link : https://codeforces.com/contest/1249/problem/C2
   
 */

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
ll int n;
cin>>n;
vector<int> base3;
int pos2=-1;

while(n>0){
 base3.push_back(n % 3);
 if(n%3==2) pos2=base3.size()-1;
 n/=3;
}
base3.push_back(0);
if(pos2!=-1){
	ll int pos0=find(base3.begin()+pos2,base3.end(),0)-base3.begin();

	base3[pos0]=1;
	
	for(int i=pos0-1; i>=0; i--) base3[i]=0;
}
ll int ans=0,power=1;
for(int i=0;i<base3.size();i++){
	if(base3[i]){
		ans+=power;
	}
	power*=3;
} 
cout<<ans<<endl;	
}
return 0;	
}