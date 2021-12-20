#include<iostream>
#include<map>
using namespace std;
int main(){
map<string,int> mp;
int n;
string s;
cin>>n;
while(n>0){
 cin>>s;
 mp[s]++;
n--;	
}
int q;
cin>>q;
string temp;
while(q>0){
 cin>>temp;
 if(mp.find(temp)==mp.end()){
 	cout<<-1;
 }
 else{
 	cout<<mp[temp];
 }

 q--;	
}



return 0;	
}