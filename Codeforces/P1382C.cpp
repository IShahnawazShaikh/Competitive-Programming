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
int t;
cin>>t;
while(t--){
int n,i;
cin>>n;
string a,b;
cin>>a>>b;
vector<int> ans;
for(i=0;i<n;i++){
	if(a[i]!=b[i]){
		ans.push_back(i+1); 
		ans.push_back(1); 
		ans.push_back(i+1); 
	}
}

cout<<ans.size()<<" ";
for(auto i: ans)
   cout<<i<<" ";
cout<<endl;

}
return 0;	
}