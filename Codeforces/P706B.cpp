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
int bS(vector<int> &arr, int l, int r, int x){ 
    while (l <= r) { 
        int mid = l + (r - l) / 2; 
        if (arr[mid] == x) 
             return mid; 
        if (arr[mid] < x) 
            l = mid + 1; 
        else
            r = mid - 1; 
    } 
    return -1; 
} 
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n;
cin>>n;
vector<int> v(n);
for(auto &i:v)cin>>i;
sort(v.begin(),v.end());
int q;
cin>>q;
while(q--){
 int m;
  cin>>m;
  cout<<upper_bound(v.begin(),v.end(),m)-v.begin()<<endl;
}
return 0;	
}