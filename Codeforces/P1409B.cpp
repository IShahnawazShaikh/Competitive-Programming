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
 ll a,b,ax,by,k;
 cin>>a>>b>>ax>>by>>k;
 ll a2=a;
 ll b2=b;
 ll k2=k;

 ll d1=abs(a-ax);
 ll d2=abs(b-by);
 
 if(k>d1){
 	a-=d1;
 	k-=d1;
    
    if(k<=d2)
    	b-=k;
    else
    	b-=d2;
 }
 else{
 	a-=k;
 }
if(k2>d2){
 	b2-=d2;
 	k2-=d2;
    
    if(k2<=d1)
    	a2-=k2;
    else
    	a2-=d1;
 }
 else{
 	b2-=k2;
 }

cout<<min(a*b,a2*b2)<<endl;
}
}