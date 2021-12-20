#include<iostream>
#include<vector>
using namespace std;
int xorOperation(int n,int start){
 int i,ans;
 vector<int> v(n,0);
  for(i=0;i<n;i++)v[i]=start+(2*i);
  ans=v[0];
  if(n==1)
    return ans;
  for(i=1;i<n;i++)
      ans=ans^v[i];
  return ans;     	 	
}
int main(){
int n,start;	
cin>>n>>start;
cout<<xorOperation(n,start);

return 0;
}