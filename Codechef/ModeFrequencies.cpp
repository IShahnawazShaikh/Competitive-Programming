/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
#include<map>
using namespace std;
#define int int64_t
#define F    first
#define S    second
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t,i;
cin>>t;
while(t--){
int n;
cin>>n;
map<int,int> m;
map<int,int> m2;
for(i=0;i<n;i++){
int temp;
cin>>temp;
 m[temp]++;

}
for(auto i : m)
	 m2[i.S]++;

int ans=0,gr=0;
for(auto i : m2){
	 if(gr < i.S){
	 	gr=i.S;
	 	ans=i.F;
	 }
	 else if(gr==i.S){
	 	if(ans > i.F)
	 		ans=i.F;
	 }
}
cout<<ans<<endl;	
}
return 0;	
}