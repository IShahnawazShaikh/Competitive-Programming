#include<iostream>
#include<vector>
using namespace std;
vector<int> decompressRLElist(vector<int> &nums){
   int i,freq,val;
   vector<int> temp;
   for(i=0;i<nums.size();i+=2){
     freq=nums[i];
     val=nums[i+1];
     while(freq>0){
       temp.push_back(val);
       freq--;
     }
   }
  return temp;
}
int main(){
int n,i;	
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
vector <int> temp=decompressRLElist(v);
for(auto val: temp){
  cout<<val<<" ";
}
return 0;
}