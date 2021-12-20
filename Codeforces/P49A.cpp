/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
  
  Question link : https://codeforces.com/problemset/problem/49/A 
*/

#include<iostream>
#include<vector>
#include<algorithm>
#include<string>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
string s;
getline(cin,s);



s.erase(remove(s.begin(),s.end(),' '),s.end());
int l=s.size()-2;
if(s[l]=='a' || s[l]=='e' || s[l]=='i' || s[l]=='o' || s[l]=='u' || s[l]=='y'|| 
	s[l]=='A' || s[l]=='E' || s[l]=='I' || s[l]=='O' || s[l]=='U' || s[l]=='Y')
	 cout<<"YES";
else
    cout<<"NO";	


return 0;	
}