#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
int n,i,l,r;
bool k=true;
cin>>n;
vector<int> v1(n);
for(i=0;i<v1.size();i++)
	cin>>v1[i];
sort(v1.begin(),v1.end());
vector<int>v2(n,0);   //initialize all with 0
l=0,r=n-1;
for(i=0;i<v1.size();i++){
   if(k){
   	 v2[l]=v1[i];
   	 k=false;
   	 l++;
   }
   else{
    v2[r]=v1[i];
    k=true;
    r--;
   }
}
for(auto &val: v2)
   cout<<val<<" ";
return 0;
}