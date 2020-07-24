  /*
      ------------------------------|بسم الله الرحمن الرحيم|------------------------------//
      ------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
      __________________________________ShahnawazShaikh_____________________________________
   */
#include<iostream>
#include<vector>
using namespace std;

#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int count[3]={0};
 int sum=0,i;
  for(i=0;i<3;i++){
   string s;
   cin>>s;
   if(s[1]=='>')
      count[s[0]-'A']++;
   else
      count[s[2]-'A']++;
   }
if(count[0]==1 & count[1]==1 & count[2]==1){
   cout<<"Impossible";
}
else{
   vector<char> v(3);
   for(i=0;i<3;i++){
     v[count[i]]='A'+i;
   }
   for(auto val: v)
      cout<<val;
}
 return 0;	
}