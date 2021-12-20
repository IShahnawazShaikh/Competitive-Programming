#include<iostream>
#include<queue>
using namespace std;
int main(){

vector<int>v{5,7,0,9,1};
priority_queue<int> q;
//priority_queue<int,vector<int>,greater<int>> q;  change priority
for(i=0;i<v.size();i++)
 q.push(v[i]);   //q.push(-v[i]);


for(i=0;i<v.size();i++){
  cout<<q.top()<<endl;    //cout<<-q.top()<<endl;
  q.pop();
}
 return 0;	
}