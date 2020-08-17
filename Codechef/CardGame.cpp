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
int t;
cin>>t;
while(t--){
int pc,pr;
cin>>pc>>pr;
int c_cnt=0,r_cnt=0;

c_cnt=pc/9;
if(pc-9*c_cnt!=0)
	 c_cnt+=1;

r_cnt=pr/9;
if(pr-9*r_cnt!=0)
	r_cnt+=1;

if(c_cnt < r_cnt)
	cout<<0<<" "<<c_cnt<<endl;
else
	cout<<1<<" "<<r_cnt<<endl;
}
return 0;	
}