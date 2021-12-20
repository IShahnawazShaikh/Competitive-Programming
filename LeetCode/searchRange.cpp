#include<iostream>
#include<vector>
using namespace std;
vector<int> searchRange(vector<int> &nums,int target){
	int i,index;
	bool b=true;
	vector<int> temp(2,-1);
	for(i=0;i<nums.size();i++){
       if(target==nums[i]){
       	 if(b){
       	 	 index=i;
       	 	 temp[0]=i;
       	 	 b=false;
       	 }
       	 else
       	 	temp[1]=i;
       }
   }
 if(temp[0]!=-1 & temp[1]==-1)
 	 temp[1]=index;
 return temp;
}    
int main(){
int n,i,target;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++){
	cin>>v[i];
}
cin>>target;
vector<int>range=searchRange(v,target);
for(auto val:range){
	cout<<val<<" ";
}

return 0;	
}