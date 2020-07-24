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
int i;
vector<int> v;
for(i=0;i<3;i++){
	int x;
	cin>>x;
	v.push_back(x);
}
sort(v.begin(),v.end());
if(v[1]!=v[2])
	cout<<"NO"<<endl;
else{
	cout<<"YES"<<endl;
	cout<<v[0]<<" "<<v[0]<<" "<<v[2]<<endl;
  }
}
return 0;	
}