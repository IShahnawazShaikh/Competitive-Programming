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
vector<int > v, k;
 
bool can( int x )
{ 
   int cnt = 0;
 
   for ( auto i : v)
   {
     if( i <= x)cnt++;
   }
   
  // cout<<endl<<"vector cnt "<<cnt;
   for ( auto i : k)
   {
     if( i >= 0 && i <= x ) 
        cnt++;
 
     else if(i < 0 && abs(i) <= cnt)
        cnt--;
   }
   //cout<<endl<<"query cnt "<<cnt;
 
 
 
   if(cnt > 0)return true;
 
   return false;
 
}


int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);  

 int n, q;
 
    cin >> n >> q; 
 
    v.assign(n, 0);
    k.assign(q, 0);
 
    int add = n, minus = 0 ; 
 
    for ( auto &i : v ) 
        cin >> i;
 
    for ( auto &i : k )
    { 
        cin >> i;
 
        if(i >= 0 )add++; 
        else minus++;
 
    }
 
    if( add == minus )
    {
        cout << 0 << endl;
        return 0;
    }
 
    int l = 1, r = 1e6, ans ;
 
    while(l <= r)
    {
        //cout<<endl<<"l "<<l<<" r "<<r;
        int mid = l + ( r - l ) / 2;
        //cout<<endl<<"mid "<<mid;

        if(can(mid))
        {   
            //cout<<endl<<"if";
            ans = mid;
            r = mid - 1;
        }
        else
        {
            //cout<<endl<<"else";
            l = mid + 1;
        }
    }
 
    cout << ans << endl;
 

return 0;   
}


