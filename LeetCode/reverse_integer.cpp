#include<iostream>
#include<cmath>
using namespace std;
int reverse(int x) {
        int rem;
        long long int req=0;
        x*=-1;
        while(x!=0){
            rem=x%10;
            x/=10;
            req=req*10+rem;
        }
        req=req*(-1);
        if(req > 2147483647 | req < -2147483648)
           return 0;     
       return req;
    }
int main(){
int num;
cin>>num;
cout<<reverse(num);
return 0;
}