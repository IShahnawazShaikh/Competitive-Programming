/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
#include<cmath>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,m;
cin>>n>>m;
int p=pow(2,n);
cout<<m%p;
 return 0;	
}