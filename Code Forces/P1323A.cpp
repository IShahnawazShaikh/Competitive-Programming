/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n;
cin>>n;
int i;
vector<int> v(n);
for(i=0;i<n;i++)cin>>v[i];	 
bool status=true;
int index=0;
for(i=0;i<n;i++){
	if(v[i]&1^1){
        index=i;
        status=false;
		break;
	}
}	 
if(status){
  if(n==1){
    cout<<-1;
  }
  else{
  	cout<<2;
    cout<<endl<<1<<" "<<2;
  }
}
else{
cout<<1<<endl;
cout<<index+1; 
}
cout<<endl;
 }

 return 0;	
}

// Question link https://codeforces.com/problemset/problem/1323/A