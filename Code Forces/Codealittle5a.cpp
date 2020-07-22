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
int n;
cin>>n;
int cnt=0;
while(n){
 if(n&1)
 	cnt+=1;
 n/=2;
}
cout<<cnt;
return 0;	

}