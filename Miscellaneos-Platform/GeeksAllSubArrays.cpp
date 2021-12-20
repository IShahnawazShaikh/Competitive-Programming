#include<iostream>
#include<vector>
using namespace std;
int main(){
int n,i,j;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
for(i=0;i<n;i++){
 cout<<v[i]<<endl;
 vector<int> sub;
 sub.push_back(v[i]);
 for(j=i+1;j<n;j++){
 	sub.push_back(v[j]);
 	for(auto val: sub){
 	  cout<<val<<" ";	
 	}
 	cout<<endl;
 }
}
return 0;
}