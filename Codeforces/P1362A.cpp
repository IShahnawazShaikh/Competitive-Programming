#include<iostream>
using namespace std;
class AncientComputer{
   private:
   	unsigned long long int a,b;
   	int operation;
   public:
   void initialiaze(unsigned long long int a,unsigned long long int b){
        this->a=a;
        this->b=b;
      if(a<b)
         this->a=(a+b)-(this->b=a);
      this->operation=0;
   }
  int find(){
    if(a==b)
      return operation;
    else
       return this->calc(operation);
 }
 int calc(int operation){
     if(a==b)
       return operation;
     if(a%8==0 & a/8>=b){
       operation+=1;
       a=a/8;
      return calc(operation);
    }
    else if(a%4==0 & a/4>=b){
      operation+=1;
      a/=4;
      return calc(operation);
    }
    else if(a%2==0 & a/2>=b){
      operation+=1;
      a/=2;
      return calc(operation);
    }
    else
     return operation=-1;
 }
};
int main(){
int t;
cin>>t;
while(t>0){	
unsigned long long int a,b;
cin>>a;
cin>>b;
AncientComputer obj;
obj.initialiaze(a,b);
cout<<obj.find();
cout<<endl;
t--;
}
return 0;	
}