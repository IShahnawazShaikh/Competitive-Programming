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
vector<int> v;
int cnt=0;
for(i=0;i<n;i++){
 int temp;
 cin>>temp;
 if(temp==0)
 	cnt+=1;
 else{
 	if(cnt!=0)v.push_back(cnt);
 	cnt=0;	
 }
}
if(cnt)
	v.push_back(cnt);


sort(v.begin(),v.end(),greater<int>());
if(v.size()==0)
	cout<<"No"<<endl;
else if(v.size()==1){
	if(v[0]&1)
		cout<<"Yes"<<endl;
	else
		cout<<"No"<<endl;
}
else{

int max=v[0];
cnt=0;
for(auto i : v){
	if(i > max/2)
		cnt+=1;
}

if(cnt<2){
  if(v[0]&1)
		cout<<"Yes"<<endl;
	else
		cout<<"No"<<endl;	
}
else
	cout<<"No"<<endl;

}	
}
return 0;	
}