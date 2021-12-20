#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
vector<int> nums{0,1,2,2,3,0,4,2};
int i,vl=2,vl2=3;
 vector<int>::iterator enditr=remove_if(nums.begin(),nums.end(),[vl](int x){
   if(x==vl)
    return true;
   else
    return false;
    });
  return distance(nums.begin(), enditr);   //size will remain so, we have to use distance function
 
return 0;
}