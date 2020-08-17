/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________

  Question link: https://codeforces.com/contest/1398/problem/A

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
int n,i,j;
cin>>n;
vector<int> v(n);

for(i=0;i<n;i++)cin>>v[i];
bool st=true;
for(i=0;i<n-1;i++){
	 if(v[i]+v[i+1] <= v[n-1]){
        st=false;
        cout<<i+1<<" "<<i+2<<" "<<n<<endl;
        break;
	 }

}
if(st)
	cout<<-1<<endl;
}
return 0;	
}