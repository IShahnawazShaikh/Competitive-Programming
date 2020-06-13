#include<iostream>
#include<map>
using namespace std;
int romanToString(string s){
	int i,num=0;
	char ch;
	map<char,int> mp;
	map<char,int> mp2;
	mp2['M']=7;
	mp2['D']=6;
	mp2['C']=5;
	mp2['L']=4;
	mp2['X']=3;
	mp2['V']=2;
	mp2['I']=1;

	mp['I']=1;
	mp['V']=5;
	mp['X']=10;
	mp['L']=50;
	mp['C']=100;
	mp['D']=500;
	mp['M']=1000;
	ch=s[s.length()-1];
	num=mp[ch];
	for(i=s.length()-2;i>=0;i--){
       if(mp2[ch]<=mp2[s[i]]){
       	ch=s[i];
       	num+=mp[s[i]];
       }
       else{
       	 num-=mp[s[i]];
       	 ch=s[i];
       }
	}
return num;

}

int main(){
string roman;
cin>>roman;
cout<<romanToString(roman);
return 0;	
}