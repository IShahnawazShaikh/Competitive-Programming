#include<iostream>
#include<vector>
using namespace std;
int main(){
int n,sum=0,i;
cin>>n;
vector<int>v(n);
for(i=0;i<n;i++){
	 cin>>v[i];

}
for(i=0;i<n;i++){
	 sum+=v[i];
	 v[i]=sum;
}
for(auto val: v){
	cout<<val<<" ";
}
return 0;	
}