/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int i,n;
cin>>n;
vector<int> p(n);
for(i=0;i<n;i++)cin>>p[i];

int b=1;
for(i=1;i<n-1;i++){
	if(p[i] > p[i-1] && p[i]>p[i+1] ){
		b=0;
        cout<<"YES"<<endl;	
        cout<<i<<" "<<i+1<<" "<<i+2<<endl;
		break;
	}
}	
if(b){
  cout<<"NO"<<endl;
 }
}
return 0;	
}