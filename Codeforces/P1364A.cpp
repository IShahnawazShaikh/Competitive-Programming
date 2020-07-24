#include<iostream>
#include<vector>
using namespace std;
int main(){
int t,n,x,i,j,k,sum=0,Plength=0,Clength=0;
cin>>t;
while(t>0){
cin>>n>>x;
vector<int>prices(n);
Plength=0;
for(int i=0;i<n;i++)
	cin>>prices[i];
        for (int j=0;j<n;j++) { 
            sum=0;
            Clength=0;
            for (int k=0;k<=j;k++) {
                sum+=prices[k];
                Clength+=1;
            }
             if(sum%x!=0){
                 if(Clength>Plength)
                    Plength=Clength; 
               } 
        } 
  if(Plength==0)
     cout<<-1;
   else    
    cout<<Plength;
  cout<<endl;
  t--;
 }   
return 0;	
}