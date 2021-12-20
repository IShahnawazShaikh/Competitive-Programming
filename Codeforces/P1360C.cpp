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
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
while(t--){
        int n;
        cin>>n;
        int*a = new int[n];
        int i;
 
        int odd = 0 , even= 0;
 
         for(i=0;i<n;i++)
        {
            cin>>a[i];
            if(a[i]%2)
                odd++;
            else
                even++;
        }
 
        if(odd%2==0 && even%2==0)
        {
            cout << "YES" << endl;
            continue;
        }
 
        sort(a,a+n);
 
        int minn = -1;
        for(i=1;i<n;i++)
        {
           if(a[i] - a[i-1] == 1)
            minn = 1;
        }
        if(minn == 1)
        {
            cout <<"YES" << endl;
        }
        else{
            cout << "NO"  <<endl;
        }	
 }
 return 0;	
}