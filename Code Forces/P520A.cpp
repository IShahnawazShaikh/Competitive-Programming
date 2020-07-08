/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,i;
cin>>n;
string s;
cin>>s;
vector<int> cntArr(26,0);
string ans="YES";
if(n<26 | s.size() < 26){
	ans="NO";
}
else{
	 transform(s.begin(),s.end(), s.begin(),::toupper); //all the character into upper case
	for(i=0;i<s.size();i++)
      cntArr[s[i]-'A']++;
    for(i=0;i<cntArr.size();i++){
    	if(cntArr[i]<1){
           ans="NO";
           break;
         }
       }
}
cout<<ans;       
 return 0;	
}