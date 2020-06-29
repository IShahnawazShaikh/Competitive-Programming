
      
          
    //------------------------------|بسم الله الرحمن الرحيم|------------------------------//
    //------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//

 

#include<iostream>
#include<vector>
using namespace std;
#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int n,i;
 cin>>n;
 string ans="";
 bool status=true;
 if(n<2){
   ans="I hate it";
 }
 else{
 	 for(i=1;i<n;i++){
       if(status){
         ans+="I hate that ";
         status=false;
       }
       else{
         ans+="I love that ";
         status=true;
       }

 	 }
 	 if(n%2==0)
 	 	ans+="I love it";
 	 else
 	 	ans+="I hate it";
 }
 cout<<ans;



 return 0;	
}