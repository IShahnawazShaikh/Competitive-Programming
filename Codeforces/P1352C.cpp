/*
    ******
    
       

    ******
*/
#include<iostream>
using namespace std;
#define ll long long int
int main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int t;
 cin>>t;
 while(t--){
 ll n,k,ans;
 cin>>n>>k;
 ans=k+ (k/(n-1));
 if(ans%n==0)
 	cout<<ans-1;
 else
 	cout<<ans;



cout<<endl;
}
 return 0;	
}