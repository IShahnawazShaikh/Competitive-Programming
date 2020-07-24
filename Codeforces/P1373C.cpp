/*
    ************
*/
#include<iostream>
#include<vector>
#define int int64_t
using namespace std;
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int t;
 cin>>t;
 while(t>0){
 string s;
 cin>>s;
 int n=s.length();
 int i;
 int res = 0;
 int cur = 0;
 for(i=0;i<n;i++){
  if(s[i] == '-'){
        
     cur--;
     if(cur < 0){
        res += i+1;
        cur++;
       }
    }
   else{
     cur++;
    }
  }
cout <<res+n<< endl;
t--;
 }
 return 0;	
}