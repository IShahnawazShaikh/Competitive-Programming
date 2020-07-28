/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
 
    Question link : https://codeforces.com/contest/888/problem/B
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
#define S second
#define F first
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n;
cin>>n;
int i;

string s;
cin>>s;
int x1=0,x2=0;
int y1=0,y2=0;
for(i=0;i<n;i++){
if(s[i]=='U')
	 y1+=1;
else if(s[i]=='D')
	y2+=1;
else if(s[i]=='L')
	x1+=1;
else 
	x2+=1;
}
cout<<2*min(x1,x2)+2*min(y1,y2);   //correct left and right equal similary up and down must be equal
return 0;	
}