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
vector<int> v;
int n;

int sequence(int x){
 int net=0;
 int i;
 for(i=0;i<n;i++){
 	 if(x&1)
 	  net+=v[i];
 	 else
 	  net-=v[i];
  x>>=1;
 }
 return net;
}
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int i;
cin>>n;
for(i=0;i<n;i++){
  int temp;
  cin>>temp;
  v.push_back(temp);
}
int range=(1<<n);
bool st=false;
for(i=0;i<range;i++){
	int sol=sequence(i);
    if(abs(sol)%360==0){
        st=true;
    	break;
    }
}
if(st)
   cout<<"YES";
else
  cout<<"NO";   	
return 0;	
}