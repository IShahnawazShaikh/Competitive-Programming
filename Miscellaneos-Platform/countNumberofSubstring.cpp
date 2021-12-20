#include<iostream>
#include<map>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
string s="00011011";
int i,zero=0;
map<int,int> m;
for(i=0;i<s.size();i=i+2){
 if(s[i]=='0') zero+=1;
 if(s[i+1]=='0') zero+=1;
 m[i+1]=zero;
}

int ans=0;
int cz=0,co=0,cz2=0,co2=0;
if(zero==s.size()-zero) ans+=1;


for(i=2;i<s.size();i+=2){
	string s1=s.substr(0,i);
	string s2=s.substr(i,s.size());
    cz=m[i-1];
    co=s1.size()-cz;
    
    cz2=m[s.size()-1];
    co2=s.size()-cz2;

    cz2=cz2-cz;
    co2=co2-co;
    if(cz==co && cz2==co2) ans+=1;
}
cout<<ans;
return 0;	
}