#include<iostream>
#include<vector>
using namespace std;
vector<int> smallerNumbersThanCurrent(vector<int> &nums){
   int i,val,count,j;
   vector<int> temp;
   for(i=0;i<nums.size();i++){
   	count=0;
      val=nums[i];
      for(j=i+1;j<nums.size();j++){
          if(val>nums[j])
          	 count+=1;
      }
      for(j=i-1;j>=0;j--){
          if(val>nums[j])
          	 count+=1;
      }
     temp.push_back(count);
   }
  return temp;
}
int main(){
int n,i;	
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
vector <int> temp=smallerNumbersThanCurrent(v);
for(auto val: temp){
  cout<<val<<" ";
}
return 0;
}