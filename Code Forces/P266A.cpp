/*
    ******
    
          
    //------------------------------|بسم الله الرحمن الرحيم|------------------------------//

    ******
*/

#include<iostream>
#include<vector>
using namespace std;

#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int n,i,ans=0;
 string s="";
 cin>>n;
 cin>>s;
 char ch=s[0];
 for(i=1;i<n;i++){
  if(s[i]==ch){
  	  ans++;
  }
  	ch=s[i];
 }
cout<<ans;


 return 0;	
}