/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
int n,i;
cin>>n;
ll int x;
cin>>x;
ll int sum=0;
for(i=0;i<n;i++){
	int temp;
	cin>>temp;
	if(temp<=x)
		sum+=temp;
}

sum=(x*(x+1))/2-(2*sum);

cout<<sum<<endl;	
}
return 0;	
}