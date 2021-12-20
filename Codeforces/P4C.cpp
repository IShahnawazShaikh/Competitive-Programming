/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<map>
#include<algorithm>
using namespace std;
#define int int64_t
#define F  first
#define S  second
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
map<string,int> m;
while(t--){
string s;
cin>>s;
m[s]++;

if(m[s]>1){
   cout<<s<<m[s]-1<<endl;
   string t=s+to_string(m[s]-1);
   m[t]++;
}
else
	cout<<"OK"<<endl;

}
return 0;	
}