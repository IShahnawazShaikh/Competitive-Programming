#include<iostream>
#include<vector>
#include<cmath>
using namespace std;
vector<bool>isPrime(1e6+1,true);
vector<long long int>primes;
void seive(){
long long int i,j;
for(i=2;i<=1e6;i++){
    if(isPrime[i]){
    	primes.push_back(i);
     for(j=i*i;j<=1e6;j+=i)
          isPrime[j]=false;
    } 
 }
}
bool is_prime(long long int n){
	if(n<1e6)
		return isPrime[n];
	for(auto p:primes){
	   if(p>sqrt(n))
		 return true;
	   if(n%p==0)
		 return false;
	}
	return true;
}
int main(){
seive();
long long int i,l,r,min=1e6,max=-1,min_left,max_left,min_right,max_right,prev=-1;
while(cin>>l>>r){
  prev=-1;	
   for(i=l;i<=r;i++){
    if(is_prime(i)){
         if(prev==-1)
           prev=i;
         else{
           if((i-prev)<min){
             min=i-prev;
             min_left=prev;
             min_right=i;
           }
           if((i-prev)>max){
             max=i-prev;
             max_left=prev;
             max_right=i;
           }
         prev=i;
         }
    } 
    else{
    	cout<<endl<<"Not Prime: "<<i;
    }
  }
  cout<<endl<<"min_left "<<min_left<<" min_right "<<min_right<<" min distance "<<min;
  cout<<endl<<"max_left "<<max_left<<" max_right "<<max_right<<" max distance "<<max;
  cout<<endl;
}
return 0;	
}