#include<iostream>
#include<map>
using namespace std;
int main(){
int i,n,element;
map<int,int>mp;
cin>>n;
for(i=0;i<n;i++){
	cin>>element;
	mp[element]=i+1;
}
for(auto i: mp){
	cout<<i.second<<" ";
}
return 0;	
}