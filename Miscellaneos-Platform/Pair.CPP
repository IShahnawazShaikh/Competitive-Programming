#include<utility>
#include<iostream>
using namespace std;
int main(){
 pair<int,int> p1;
 p1=make_pair(1,3);
 cout<<p1.first;	
 cout<<p1.second;

 pair<pair<int,int>,pair<char,int>>p2;
 p2=make_pair(make_pair(1,10),make_pair('A',2));
 cout<<endl<<p2.first.first;
 cout<<endl<<p2.first.second;
 cout<<endl<<p2.second.first;
 cout<<endl<<p2.second.second;
return 0;	
}