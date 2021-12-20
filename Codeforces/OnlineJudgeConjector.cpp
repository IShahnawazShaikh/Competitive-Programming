#include<iostream>
#include<vector>
using namespace std;
vector<bool> isPrime;
vector<int> primes;
void seive(int num){
	int i,j;
isPrime.assign(num+1,true);
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
int num,p1=0,p2=0,mid,i,j,diff=0;
bool status=false;

cin>>num;
seive(num);
for(i=0;i<primes.size();i++){
 mid=(primes.size()+i)/2;
  if(primes[i]+primes[mid]==num){
  	 // p1=primes[i];
  	 // p2=primes[mid];
     //cout<<endl<<primes[i]<<"  "<<primes[mid];    getting all the prime number
  	 if(diff<abs(primes[mid]-primes[i])){
  	 	p1=primes[i];
  	    p2=primes[mid];
  	 }
  	 //status=true;
  	 //break;     to get first pair
  }
  else if(primes[i]+primes[mid]<num){
     for(j=mid+1;j<primes.size();j++){
     	if((primes[i]+primes[j])==num){
             // p1=primes[i];
             // p2=primes[j];
             //status=true;
             //break;  to get first pair
              //cout<<endl<<primes[i]<<"  "<<primes[mid];   getting all the prime number
              if(diff<abs(primes[mid]-primes[i])){
  	 	        p1=primes[i];
  	            p2=primes[mid];
  	          }
          }
     	}
  }
 // if(status){
 // 	break;   // to uncomment for getting only first pair, initaillay false but it will be tru after getting firts pair
 // }
}

cout<<endl<<p1<<" "<<p2;
return 0;
}
