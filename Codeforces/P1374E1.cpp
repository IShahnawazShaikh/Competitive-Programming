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
int n,k,ac=0,bc=0;
cin>>n>>k;
vector<int> main;
vector<int> a_array;
vector<int> b_array;
while(n--){

int t,a,b;
cin>>t>>a>>b;

if(a==1) ac+=1;
if(b==1) bc+=1;

if(a==1 && b==1) main.push_back(t);
else{
	if(a==1) a_array.push_back(t);
	if(b==1) b_array.push_back(t);
 }
}




if(ac>=k && bc>=k){
  int i,ans=0;
  sort(main.begin(),main.end());
  sort(a_array.begin(),a_array.end()); 
  sort(b_array.begin(),b_array.end());  
  

 int l=0,m=0,n=0;
 int aSize=a_array.size();
 int bSize=b_array.size();
 int mSize=main.size();
 for(i=1;i<=k;i++){

 if(aSize>=1 && bSize>=1){
  
   if(mSize>=1){
   	 if((a_array[l]+b_array[m])<=main[n]){
    	ans=ans+a_array[l]+b_array[m];
    	l+=1;
    	m+=1;
    	aSize-=1;
    	bSize-=1;
    }
    else{
    ans+=main[n];	
 	n+=1;
 	mSize-=1;
    }
   }
   else{
   	  ans=ans+a_array[l]+b_array[m];
    	l+=1;
    	m+=1;
    	aSize-=1;
    	bSize-=1;
   }


   
 }
 else{
 	ans+=main[n];
 	n+=1;
 	mSize-=1;
 } 

}
cout<<ans;
}
else cout<<-1;

return 0;	
}