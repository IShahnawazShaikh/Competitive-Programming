#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
int n,i,coin=0,value=0;
float total=0.0;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++){
	cin>>v[i];
	total+=v[i];
}
sort(v.begin(),v.end(),greater<int>());
for(i=0;i<n;i++){
 coin+=1;
 value+=v[i];
 if(value>total/2){
 	break;
 }
 	
}
cout<<coin;
return 0;	
}