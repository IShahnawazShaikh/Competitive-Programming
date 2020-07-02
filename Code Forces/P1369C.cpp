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
 ll int n,k,i,j;
 cin>>n>>k;
 vector<ll int> a(n);
 vector<ll int> w(k);

 for(i=0;i<n;i++)
 	cin>>a[i];
for(i=0;i<k;i++)
 	cin>>w[i];

sort(a.begin(),a.end());
sort(w.begin(),w.end());

ll int p1=0;
ll int p2=n-1;
ll int index=1;
ll int ans=0;
for(i=0;i<k;i++){
 
   if(w[i]==1){
   	 ans+=a[p2]+a[p2];
     p2-=1;
   }
   else{
       int temp=w[k-index];
        index+=1;
        ans+=a[p2]+a[p1];
        p2-=1;
        p1+=temp-1;
   }
}

cout<<ans;

cout<<endl;
}
 return 0;	
}