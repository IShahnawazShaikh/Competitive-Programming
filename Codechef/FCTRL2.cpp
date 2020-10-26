/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
 #include <boost/multiprecision/cpp_int.hpp> 
using namespace boost::multiprecision;
using namespace std;
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
 int n;
 cin>>n;
 cpp_int fact=1;
 while(n!=1){
     fact*=n;
     n-=1;
 }
cout<<fact<<endl;
}
return 0;	
}