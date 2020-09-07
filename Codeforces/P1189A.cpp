/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
       
        Link:  https://codeforces.com/contest/1189/problem/A
 
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
int ones=0,zeroes=0;
for(i=0;i<n;i++){
 if(s[i]=='0')
 	zeroes+=1;
 else
 	ones+=1;
}

if(ones==zeroes){
  cout<<2<<endl;
  for(i=0;i<s.size()-1;i++)
  	 cout<<s[i];
  	cout<<" "<<s[s.size()-1];
}
else{
	cout<<1<<endl;
	cout<<s<<endl;
}

return 0;	
}