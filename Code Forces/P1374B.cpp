/*
    ******
    
       

    ******
*/
#include<iostream>
#define ll long long int
using namespace std;

#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int t;
 cin>>t;
 while(t--){
 int x;
 int y;
 int n;
 int a;
 int b;
 int rem;
 cin>>x>>y>>n;
    int temp=n;
 	rem=n%x;
 	n-=rem;
    rem=n-abs(x-y%x);
     //cout<<rem+x<<endl;
     if((rem+x)<=temp)
     	 cout<<rem+x;
     else
     	cout<<rem;
 cout<<endl;	
 }
 return 0;	
}