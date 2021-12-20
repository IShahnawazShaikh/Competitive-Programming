#include<iostream>
#include<algorithm>
using namespace std;
bool pallindrome(int x) {
    // string str=to_string(x);
    string temp=to_string(x);
    string str=temp;
    reverse(str.begin(),str.end());
     return (temp==str) ? true : false;
    }
int main(){
int num;
cin>>num;
cout<<pallindrome(num);
return 0;
}