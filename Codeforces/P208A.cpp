/*
    ******
    
       

    ******
*/

#include<iostream>
using namespace std;
#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 string s;
 cin>>s;
 int i;
 string newstr="";
 for(i=0;i<s.length();i++){
   if(s[i]=='W'){
   	  if(s[i+1]=='U' & (i+1<s.length())){
        if(s[i+2]=='B' & (i+2<s.length())){
           i+=2;
          if(newstr.length()!=0) 
            newstr+=" ";
   	     }
   	     else{
   	     	newstr+=s[i];
      	newstr+=s[i+1];
      	i+=1;
   	     }
      }
      else{
      	newstr+=s[i];
      }
   }
   else
      newstr+=s[i];
}
cout<<newstr;

 return 0;	
}  