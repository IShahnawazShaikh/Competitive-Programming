#include<iostream>
#include<vector>
#define int int64_t
using namespace std;
int32_t main(){
int k,prod=1;	
cin>>k;	
string s="codeforces";
vector<int> val(10,1);
int i=0;
while(prod<k){
  val[i]++;
  prod=prod/(val[i]-1);
  prod*=val[i];
  i++;
  if(i==10)
  	i=0;
}
for(i=0;i<10;i++){
	while(val[i]>0){
		cout<<s[i];
		val[i]--;
	}
}
return 0;	
}