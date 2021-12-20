/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<set>
#include<algorithm>
using namespace std;
#define int int64_t
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int t;
cin>>t;
string s;
cin>>s;
set<char> st;
for(int i=0;i<t;i++){
  st.insert(s[i]);
}




if(st.size()==26 && st.size()>26) cout<<-1;
else if(t-st.size()==26) cout<<-1;
else if(t-st.size()+st.size()>=27) cout<<-1;
else cout<<t-st.size();


// if(t-st.size()>=26) cout<<-1;
// else if (st.size()>=26 && s.size()>=26) cout<<-1;
// else cout<<t-st.size();
return 0;	
}