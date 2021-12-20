/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
ll int r,g,b,w;

cin>>r;
cin>>g;
cin>>b;
cin>>w;
ll int even=0,odd=0;

if(r&1^1)
    even+=1;
else
  odd+=1;

if(b&1^1)
    even+=1;
else
  odd+=1;

if(g&1^1)
    even+=1;
else
  odd+=1;

if(w&1^1)
    even+=1;
else
  odd+=1;

if(even > odd)
	cout<<"Yes"<<endl;
else{
	if(odd==even)
		cout<<"No"<<endl;
	else if(r!=0 && b!=0 && g!=0)
		 cout<<"Yes"<<endl;
	else
	  cout<<"No"<<endl;	
}


}
return 0;	
}