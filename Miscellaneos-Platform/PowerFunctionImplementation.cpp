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

float power(float x,int y){
float temp;
 if(y==0) return 1;
 temp=power(x,y/2);
 if(y&1^1) return temp*temp;
 else{
 	if(y>0) return x*temp*temp;
 	else return (temp*temp)/x;
 }
}

int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	

cout<<power(2,-3);



return 0;	
}