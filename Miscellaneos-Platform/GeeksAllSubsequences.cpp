#include<iostream>
#include<vector>
using namespace std;
int main(){
int n,i,j;
bool status=false;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
for(i=0;i<n;i++){
 cout<<v[i];
 vector<int> sub;
 sub.push_back(v[i]);
 for(j=i+1;j<n;j++){
 	if(status){
 		cout<<v[i]<<" "<<v[j];
 	}
 	cout<<endl;
 	sub.push_back(v[j]);
 	for(auto val: sub){
 	  cout<<val<<" ";	
 	}
 	status=true;
 	cout<<endl;
 }
 status=false;
}
return 0;
}