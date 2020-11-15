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

int n,x,i;
cin>>n>>x;
long long sum=0,sum2=0;
vector<int> a(n);
for(i=0;i<n;i++){
	cin>>a[i];
	sum+=a[i];
}

if(sum%x!=0) {
  cout<<n<<endl;
  continue;
}
int ans=0,l=0;
for(i=0;i<n;i++){
 sum2+=a[i];
 l+=1;
 if(sum2%x!=0) ans=max(ans,l);
 if((sum-sum2)%x!=0) ans=max(ans,n-l);
}
if(!ans) cout<<-1<<endl;
else cout<<ans<<endl;
}

return 0;	
}