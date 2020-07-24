#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
int n,i;
cin>>n;
vector<int> v(n);
for(i=0;i<v.size();i++){
   cin>>v[i];
}
sort(v.begin(),v.end());

cout<<min(abs(v[0]-v[n-2]),abs(v[1]-v[n-1]));

return 0;	
}
