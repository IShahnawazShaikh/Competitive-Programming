//qUESTION LINK: https://codeforces.com/contest/1368/problem/D


#include<iostream>
#include<vector>
#include<algorithm>
#define ll long long
using namespace std;
int main(){
int n,i,j;
cin>>n;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];

int bt_cnt[22]={0};

for(i=0;i<n;i++){
  int j=0;

  while(v[i]){

  if(v[i]&1){

    bt_cnt[j]++;
  }
  j++;
  v[i]>>=1;
 }
}
ll int ans=0,num=0;

for(i=0;i<n;i++){
 num=0;
 ll x=1;
 for(j=0;j<22;j++){
 	if(bt_cnt[j]){
 		num+=x;
 		bt_cnt[j]--;
 	}
 	x*=2;
 }
 ans+=num*num;
}
cout<<ans<<endl;

return 0;

}