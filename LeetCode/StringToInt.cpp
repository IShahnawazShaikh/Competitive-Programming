#include<iostream>
#include<vector>
#include<algorithm>
#include<string>
using namespace std;
class Solution {
public:
int myAtoi(string str) {
  //str.erase(remove(str.begin(),str.end(),' '),str.end());
   long long i=0;
   int sign=1;
   
   while(i<str.length() && str[i]==' ')i++;
  
 
   if(str[i]=='-'){
      sign=-1;
      i+=1;
   }
   else if(str[i]=='+'){
      sign=1;
      i+=1;
   }
    
   long long ans=0;
   while(i<str.length() && (str[i]>='0' && str[i] <='9')){
     ans=ans*10+(str[i]-'0');
     if(ans>=2147483648){
     	  
        return (sign==-1) ? -2147483648 : 2147483647;
     }
   	 i++;
   }
   

  return ans*sign;
}
};
int main(){
Solution sol;

cout<<sol.myAtoi("+1");

return 0;	
}