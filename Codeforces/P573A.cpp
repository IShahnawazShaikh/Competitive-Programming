#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int i,n;
cin>>n;
int *ar=new int[n];
for(i=0;i<n;i++) cin>>ar[i];

int gcd=ar[0];
for(i=1;i<n;i++){
 gcd=__gcd(gcd,ar[i]);
}
int cnt=0;
for(i=0;i<n;i++){
if(gcd*2==ar[i] || gcd*3==ar[i] || gcd==ar[i]){
    cnt+=1; 
 }
 else{
 	ar[i]/=gcd;
 	while(ar[i]!=1){
 	 if(ar[i]%2==0) ar[i]/=2;
 	 else if(ar[i]%3==0) ar[i]/=3;
 	else{
        cnt-=1;
        break;
 	 }	
 	}
 cnt+=1;	
 }
}
if(cnt==n) cout<<"YES"<<endl;
else cout<<"NO"<<endl;

return 0;	
}