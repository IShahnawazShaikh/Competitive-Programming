/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
#include<cmath>
using namespace std;
#define int int64_t
int n,p;

bool possible(int x){
 
  int net = n - x*p;
 
    int j =0, cnt=0;
 
    priority_queue<int> q;
 
    while(net>0)
    {
      if(net & 1)
        {
          q.push(pow(2, j));
         // cout<<endl<<"power "<<pow(2,j);
          cnt++;
        }
      j++;
      net >>= 1;
    }

 
    if(cnt > x)
    {
      return false;
    }
   
    
      while(!q.empty() && (int)q.size() < x)
      {
         int y = q.top();
         q.pop();
 
         y >>= 1;
 
         if(y >=1)
         {
           q.push(y);
           q.push(y);
           cnt++;
         }
         else
         {
           break;
         }
      }
 
      return cnt == x;
}
 

int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
    
    cin>>n>>p;
    for(int i=1; i<=32; i++)
    {
    //	possible(i);
      if(possible(i))
      {
        cout<<i<<endl;
        return 0;
      }
    }
 
   cout<<-1<<endl;



		 

return 0;	
}