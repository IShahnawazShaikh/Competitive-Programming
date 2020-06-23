#include<iostream>
using namespace std;
int main(){
int t;
long long int n;
cin>>t;
while(t>0){
cin>>n;
if(n==3)
	cout<<"NO";
else{
	if(n%4==0){
		cout<<"YES";
	}
	else{
		cout<<"NO";
	}
}


cout<<endl;
t--;
}

return 0;	
}