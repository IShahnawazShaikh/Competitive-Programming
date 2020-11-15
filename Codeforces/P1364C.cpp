#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	

int n,i;
bool st=false;
cin>>n;
vector<int> a(n);
vector<bool> index(100005,false);
for(i=0;i<n;i++) {
  int x;
  cin>>x;
  a[i]=x;
  index[x]=true;
}
vector<int> ans(n,-1);

for(i=0;i<n-1;i++){
	if(a[i]>i+1){
		st=true;
		break;
	}

	else if(a[i]!=a[i+1]){
      ans[i+1]=a[i];
	}

}


if(st) cout<<-1;
else{

int x=0;  
for(i=0;i<n;i++){
   if(ans[i]==-1){
     while(index[x]) x+=1;
     index[x]=true;
     ans[i]=x;
    } 
}
for(auto i: ans) cout<<i<<" ";
}

return 0;	
}