#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int i,n;
cin>>n;
int *ar=new int[n];
vector<int> odd;
vector<int> even;
for(i=0;i<2*n;i++){
  int x;
  cin>>x;
  if(x&1) odd.push_back(i+1);
  else even.push_back(i+1);
}
int e_i=0,o_i=0;
int esz=even.size();
int osz=odd.size();
for(i=0;i<n-1;i++){
   if(osz>=2){
      cout<<odd[o_i]<<" "<<odd[o_i+1]<<endl;
      osz-=2;
      o_i+=2;
   }
   else{
      if(esz>=2){
      cout<<even[e_i]<<" "<<even[e_i+1]<<endl;
      esz-=2;
      e_i+=2;
   }
   }
 }
}
return 0;	
}