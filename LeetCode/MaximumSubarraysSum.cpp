 #include<iostream>
 #include<vector>
using namespace std;
 int maxSubArray(vector<int>& nums) {
  if(nums.size()==1) return nums[0];
  int temp=nums[0];
  int ans=temp;
  for(int i=1;i<nums.size();i++){
	temp=max(temp+nums[i],nums[i]);
	ans=max(ans,temp);
   }
  return ans;
}
int main(){
 int n;
 cin>>n;
 vector<int> nums(n);
 for(int i=0;i<n;i++)cin>>nums[i];
 cout<<maxSubArray(nums);

 }