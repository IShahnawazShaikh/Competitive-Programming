#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
int n,i,questions=0;
cin>>n;
vector<int> v(n);
for(i=0;i<v.size();i++){
   cin>>v[i];
}
sort(v.begin(),v.end());
for(i=0;i<v.size();i+=2){
   questions+=abs(v[i]-v[i+1]);
}
cout<<questions;

return 0;	
}
