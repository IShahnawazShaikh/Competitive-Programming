#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
 int i,n,ans=1e3,m,m_ax,m_in,j;
  cin>>n>>m;
  vector<int> f(m);
  for(i=0;i<m;i++)cin>>f[i];
  sort(f.begin(),f.end());
 //cout<<f[0]<<endl;


  for(i=0;i<m;i++){
  	  m_in=f[i];
  	  m_ax=f[i];
      
      // cout<<endl<<"i "<<i;


     // cout<<endl<<" max "<<m_ax<<" min"<<m_in;

      for(j=i+1;j<n+i;j++){
      // cout<<endl<<m_in<<" "<<m_ax<<endl;  
       m_in=min(m_in,f[j]);
       m_ax=max(m_ax,f[j]);
    
      // cout<<endl<<" max "<<m_ax<<" min"<<m_in;
    
      }
      // cout<<endl<<"answer: "<<ans<<" max- min "<<m_ax - m_in;
      if(ans>(m_ax - m_in)){
      	ans=m_ax-m_in;
        }
      	// cout<<endl<<ans;
      	if(n+i ==m){
      		break;
      	}
  }
cout<<ans;
 return 0;
}