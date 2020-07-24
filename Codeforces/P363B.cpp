/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,k;
cin>>n>>k;

vector<int>presum;
presum.push_back(0);
int i;
for(i=1;i<=n;i++){
	int temp;
	cin>>temp;
   presum.push_back(temp+presum[i-1]);
}
vector<int> diff;
for(i=0;i<=n && i+k<=n; i++){
 diff.push_back(presum[k+i]-presum[i]);
}
n=diff[0];
k=0;
for(i=1;i<diff.size();i++){
  if(n>diff[i]){
    n=diff[i];
    k=i;
  } 
}
cout<<k+1;
return 0;	
}