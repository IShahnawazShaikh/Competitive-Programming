/*
    ******
    
       

    ******
*/
#include<iostream>
#include <deque> 
using namespace std;
#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int t;
 cin>>t;
 while(t>0){
 int n,i;
 int moves=0;
 int alice=0;
 int bob=0;
 int bobCurrent=0;
 bool status=true;
 int aliceCurrent=0;
 cin>>n;
 deque <int> deq;
 for(i=0;i<n;i++){
 	cin>>bob;
 	deq.push_back(bob);
 }
bob=0;
while(!deq.empty()){
  if(status){
   aliceCurrent=0;
   moves+=1;	
   aliceCurrent=deq.front();
   deq.pop_front();
   while(aliceCurrent<=bobCurrent){
   	if(deq.empty())
  	 	 break;
   	 aliceCurrent+=deq.front();
   	 deq.pop_front();
   }
   alice+=aliceCurrent;
   status=false;
  } 
  else{
  	bobCurrent=0;
  	moves+=1;
  	bobCurrent=deq.back();
    deq.pop_back();
    while(bobCurrent<=aliceCurrent){
    if(deq.empty())
  	 	 break;
   	 bobCurrent+=deq.back();
   	 deq.pop_back();
   }
    bob+=bobCurrent;
  	status=true;
  }
 }
 cout<<moves<<" "<<alice<<" "<<bob;
 cout<<endl;
 t--;
 }
 return 0;	
}