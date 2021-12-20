#include<iostream>
#define int int64_t
using namespace std;
int32_t main(){
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);	
 int t;
 cin>>t;
 while(t>0){
 int a,b,c;
        cin>> a>>b >> c;
        int first = -1 , second = -1;
        if(a < c){
            first = 1;
        }
        if(b*a < c)
        {
            first = b;
        }
        else if(b*a > c)
        {
            second = b;
        }
        cout << first << " " << second << endl;  	
 t--;
 cout<<endl;	
 }
 return 0;	
}