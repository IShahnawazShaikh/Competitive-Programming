/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include <cmath> 
#include <iomanip> 
using namespace std;
int main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
float x;
cin>>x;
float y;
cin>>y;
if(fmod(x,5)==0){
   if(x + 0.50 > y)
   	 cout<<fixed<<setprecision(2)<<y;
   else
   	  cout<<fixed<<setprecision(2)<<y-x-0.50;
}
else
	cout<<fixed<<setprecision(2)<<y;
return 0;	
}