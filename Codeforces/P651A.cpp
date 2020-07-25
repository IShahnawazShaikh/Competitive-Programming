/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
    
    Question link : https://codeforces.com/problemset/problem/651/A
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int a,b;
cin>>a>>b;
    int ans=0;
    while(a>0 && b>0){
        ans++;
        if(a>b)
            swap(a,b);
        a++;
        b-=2;
        if(a<0||b<0){
            ans--;
            break;
        }
    }
   cout<<ans<<endl;
return 0;	
}