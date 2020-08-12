/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
  
  Question link: https://codeforces.com/contest/919/problem/B

*/
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long

vector<ll int> v;
void seive(){
	int i;
	v.push_back(19);
 for(i=28;i<=1e8;i+=9){
     int cnt=0;
     ll int temp=i;
     while(temp>0){
        cnt+=temp%10;
        temp/=10;
     }
    if(cnt==10)
    	v.push_back(i);
 }
}

int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
seive();
int k;
cin>>k;
cout<<v[k-1];

return 0;	
}