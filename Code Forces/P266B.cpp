  
    //------------------------------|بسم الله الرحمن الرحيم|------------------------------//
    //------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//

#include<iostream>
#include<vector>
using namespace std;
#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int n,T,i,t;
 string s;
 cin>>n>>T;
 cin>>s;
 for(t=1;t<=T;t++){
   for(i=0;i<s.length();i++){
    if(s[i]=='B' & s[i+1]=='G' & i+1<s.length()){	
     s[i]='G';
     s[i+1]='B';
     i+=1;
    }
   }
 }
cout<<s;
 return 0;	
}