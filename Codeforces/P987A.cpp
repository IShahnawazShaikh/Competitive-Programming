
    //------------------------------|بسم الله الرحمن الرحيم|------------------------------//
    //------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//

#include<iostream>
#include<vector>
#include<map>
using namespace std;

#define int int64_t
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int n,i;
 cin>>n;
 map<string,string> m;
 map<string,int> v;
 m["purple"]="Power";
 m["green"]="Time";
 m["blue"]="Space";
 m["orange"]="Soul";
 m["red"]="Reality";
 m["yellow"]="Mind";
 
 for(i=0;i<n;i++){
    string s;
    cin>>s;
    v[s]=i;

 }
cout<<6-n<<endl; 
for(auto i: m){
	if(v.find(i.first)==v.end())
		 cout<<m[i.first]<<endl;
  }

 return 0;	
}