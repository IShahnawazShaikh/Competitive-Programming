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
int t;
cin>>t;
while(t--){

 int n,i;
 cin>>n;
 int gr=0;
 int index=0;
 vector<int> v(n);
 for(i=0;i<n;i++){
 	int t;
 	cin>>t;
 	v[i]=t;
 	if(t>=gr){
 		index=i;
 		gr=t;
 	}
 }
if(index==n-1){
 if(v[index]!=v[v.size()-2]){
   cout<<index+1<<endl;	
 }
 else{
 	bool st=true;
 	 for(int i=index-1;i>=0;i--){
 	 	 if(v[i]==v[index]) continue;
 	 	 else {
 	 	 	cout<<i+2<<endl;
 	 	 	st=false;
 	 	 	break;
 	 	 }
 	 }
 	 if(st) cout<<-1<<endl;
 }
}
else cout<<index+1<<endl;
}
return 0;	
}