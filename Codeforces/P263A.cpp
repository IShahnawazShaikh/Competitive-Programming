#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int i,j;
int ind_i,ind_j;
for(i=0;i<5;i++){
	for(j=0;j<5;j++){
       int x;
       cin>>x;
       if(x==1){
       	 ind_i=i;
       	 ind_j=j;
       }
	}
}
cout<<abs(ind_i-2)+abs(ind_j-2);
return 0;	
}