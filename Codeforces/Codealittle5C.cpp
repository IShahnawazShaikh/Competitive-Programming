/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
#include<queue>
#include<cmath>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	

int n,k;
cin>>n>>k;

priority_queue<int> q;

int j=0;
while(n){
 
 if(n&1){
   q.push(pow(2,j));
   k--;
 }
 j+=1;
 n>>=1;
}
 if(k<0)
 	cout<<"NO"<<endl;
 else{
 	while(k){
 		int x=q.top();
 		q.pop();
 		x>>=1;
 		if(x>=1){
 			q.push(x);
 			q.push(x);
 			k--;
 		}
 		else
 			break;
 	}

 	if(k)
 		cout<<"NO"<<endl;
 	else{
 		cout<<"YES"<<endl;
 		while(!q.empty()){ 
 			cout<<q.top()<<" ";
 			q.pop();
 		}
 	}
 }
return 0;	
}