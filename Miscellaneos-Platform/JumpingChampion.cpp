#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_map>
using namespace std;
vector<bool>isPrime(1e6+1,true);
void seive(){
int i,j;
isPrime[0]=false;
isPrime[1]=false;
for(i=2;i*i<=1e6+1;i++){
	if(isPrime[i]){
		for(j=i*i;j<=1e6+1;j+=i){
		 isPrime[j]=false;	
		}
	}
 }
}
int main(){
int L,U,T,i,key;
cin>>T;
seive();
vector<int>primes;
while(T>0){
primes.clear();
i=0;
key=0;
cin>>L>>U;
for(i=L;i<=U;i++){
 if(isPrime[i]){
   primes.push_back(i);
 }
}

if(primes.size()<2){
	cout<<"No Jumping Champion";
}
else{
unordered_map<int,int>hash;
for(i=0;i<primes.size()-1;i++){
	 hash[primes[i+1]-primes[i]]++;
 }
i=0,key=-1;
for(auto itr: hash){
	if(i<itr.second){
      i=itr.second;
      key=itr.first;
	}
 }
 if(i==1)
 	cout<<"No Jumping Champion";
 else
 	cout<<"Jumping Champion "<<key;
}	
T--;
cout<<endl;
}

return 0;	
}