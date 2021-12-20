#include<iostream>
#include<vector>
using namespace std;
vector<bool> isPrime;
vector<int> primes;
void seive(int num){
	int i,j;
isPrime.assign(num+1,true);
  primes.push_back(1);
    for(i=2;i*i<=num;i++){
     if(isPrime[i]){
        for(j=i*i;j<=num;j+=i){
           isPrime[j]=false;
		}
	 }
   }
for(i=2;i<=num;i++){
	if(isPrime[i]){
		primes.push_back(i);
	}
}

}
int main(){
int num,c,index,count,i;
cin>>num>>c;
seive(num);

if(primes.size()%2==0){
   count=2*c;
   index=(primes.size()-count)/2;
}
else{
  count=2*c-1;
  index=(primes.size()-count)/2;
}

cout<<num<<" "<<c<<":";
if(count>=primes.size()){
  for(i=0;i<primes.size();i++)
    cout<<" "<<primes[i];
}
else{
   for(i=index;i<index+count;i++)
    cout<<" "<<primes[i];
 } 

return 0;
}
