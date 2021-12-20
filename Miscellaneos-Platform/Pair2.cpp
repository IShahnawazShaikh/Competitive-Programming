#include<utility>
#include<iostream>
#include<vector>
#include<algorithm>
#define ll pair<int,int>
using namespace std;
int main(){
 pair<int,int> p;
 int n,i;
 cin>>n;
 vector<ll> v(n);
 for(i=0;i<n;i++){
   int x;	
   cin>>x;
   p=make_pair(x,i+1);
   v[i]=p;
 }
 sort(v.begin(),v.end());
 for(auto pr: v){
 	cout<<pr.first<<" "<<pr.second<<endl;
 }
return 0;	
}