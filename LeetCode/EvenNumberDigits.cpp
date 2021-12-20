#include<iostream>
#include<vector>
using namespace std;
int findNumbers(vector<int>& nums) {
 int i,count=0,number,innercount;
 for(i=0;i<nums.size();i++){
     number=nums[i];
     while(number>0){
     	innercount+=1;
     	number/=10;
     }
     if(innercount%2==0)
     	count+=1;
     innercount=0;
  }
 return count;
}
int main(){
int n,i;
cin>>n;
vector<int> nums(n);
for(i=0;i<n;i++)cin>>nums[i];
cout<<findNumbers(nums);
return 0;	
}