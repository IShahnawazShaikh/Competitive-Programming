/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
vector<int> factor(int num){
  vector<int> temp;
  for(int i=1;i*i<=num;i++){
    if(num%i==0){
		   temp.push_back(i);
		   if(i!=num/i)
			   temp.push_back(num/i);
		}
  }
  return temp;
}
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
ll int t,i,j;
cin>>t;
while(t--){	
string s;
cin>>s;
vector<int> v(26,0);
ll int length=s.length();
for(i=0;i<length;i++)v[s[i]-97]++;

// vector<int> factors=factor(length);
sort(v.begin(),v.end(),greater<int>());
// sort(factors.begin(),factors.end());

ll int ans=1e9;

 for(int j=1; j<=26; j++)
      {
        if(length % j == 0)
        {
          ll int cnt=0;
 
          ll int part = length / j;
 
          for(int k=0; k<j; k++)
          {
             
               if(v[k] < part)
              {
                 cnt += part - v[k];
              }
 
 
          }
          ans = min(ans, cnt);
        }
      }
 
      cout << ans << endl;	
}
 return 0;	
}