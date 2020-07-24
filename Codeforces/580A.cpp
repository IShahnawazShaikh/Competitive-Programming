#include<iostream>
#include<vector>
using namespace std;
int main(){
int n,i,val=0,ans,temp=1;
cin>>n;
vector<int>v(n);
for(i=0;i<n;i++)cin>>v[i];

val=v[0];
ans=1;
for(i=1;i<n;i++){
 if(val<=v[i])
 	 temp+=1;
 else
   temp=1;   
 val=v[i];
 if(ans<temp)
     ans=temp;
}

cout<<ans;
return 0;	
}