#include<iostream>
#include<vector>
using namespace std;
int main(){
long long int n,m,i,step=0,prev=0;
cin>>n>>m;
vector<long long int> v(m,0);
for(i=0;i<m;i++){
  cin>>v[i];
}
for(i=0;i<m;i++){
  if(i==0){
     step+=v[i]-1;
     prev=v[i];
  }
  else{

    if(v[i]<prev){
       step+=(n-prev)+v[i];
       prev=v[i];
    }
    else{
       step+=v[i]-prev;
       prev=v[i];
    }
  }

}
cout<<step;
return 0;	
}