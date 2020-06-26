 #include<iostream>
 #include<vector>
 #include<algorithm>
using namespace std;
int maxProduct(vector<int>& nums) {
 sort(nums.begin(),nums.end(),greater<int>());
 return (nums[0]-1)*(nums[1]-1);
}
 int main(){
 int n,i;
 cin>>n;
 vector<int>nums(n);
 for(i=0;i<n;i++)cin>>nums[i];
cout<<maxProduct(nums);
 return 0;	
 }