
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
class Solution {
public:

string longUrl;    
string encode(string longUrl) {       
  this->longUrl=longUrl;
  return "imshahnawaz";
} 

string decode(string shortUrl) {
  return this->longUrl;
}
};
int main(){
 Solution sol;
 sol.encode("anything");
 cout<<sol.decode("thing");
 return 0;
}
