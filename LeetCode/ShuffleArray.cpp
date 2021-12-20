#include<iostream>
#include<vector>
using namespace std;
vector<int> shuffle(vector<int> &nums,int n){
	int i,j=0;
	vector<int> temp(2*n);
	for(i=0;i<n;i++){
       temp[j]=nums[i];
       j++;
       temp[j]=nums[i+n];
       j++;
	}
	return temp;
}
int main(){
int n,i;	
cin>>n;
vector<int> v(2*n);
for(i=0;i<2*n;i++)cin>>v[i];
vector <int> temp=shuffle(v,n);
for(auto val: temp){
  cout<<val<<" ";
}
return 0;
}