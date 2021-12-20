  
    //------------------------------|بسم الله الرحمن الرحيم|------------------------------//
    //------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//

#include<iostream>
#include<vector>
using namespace std;
#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int x,y,z,t1,t2,t3;
 cin>>x>>y>>z>>t1>>t2>>t3;
 int stairs=abs(x-y)*t1;
 
 int elevator=(abs(z-x)*t2)+(t3*3)+abs(x-y)*t2;
 
 if(elevator<=stairs)
 	cout<<"YES";
 else
 	cout<<"NO";
 
 return 0;	
}