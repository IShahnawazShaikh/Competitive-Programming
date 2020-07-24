#include<iostream>
#include<map>
using namespace std;
int main(){
int s,n,i,xi,yi;
bool status=true;	
cin>>s;
cin>>n;
multimap<int,int> mp;
for(i=0;i<n;i++){
  cin>>xi;
  cin>>yi;	
  mp.insert({xi,yi});
}
for(auto itr=mp.begin();itr!=mp.end();itr++){
   if(s>itr->first){
   	  s+=itr->second;
   	  status=true;
   }
   else{
   	 status=false;
   	 break;
   }
}
if(status){
	cout<<"YES";
}
else{
	cout<<"NO";
}
return 0;	
}