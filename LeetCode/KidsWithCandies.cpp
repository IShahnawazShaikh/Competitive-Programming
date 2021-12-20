#include<iostream>
#include<vector>
using namespace std;
vector<bool> kidsWithCandies(vector<int> &candies,int extraCandies){
   vector<bool> temp;
   int i,max;
   max=candies[0];
   for(i=1;i<candies.size();i++){
     if(max<candies[i])
     	max=candies[i];
   }
   for(i=0;i<candies.size();i++){
     if(candies[i]+extraCandies>=max)
     	temp.push_back(true);
     else
     	temp.push_back(false);
    }
  return temp;
}
int main(){
int n,i,extraCandies;	
cin>>n>>extraCandies;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];
vector <bool> temp=kidsWithCandies(v,extraCandies);
for(auto val: temp){
  cout<<val<<" ";
}
return 0;
}