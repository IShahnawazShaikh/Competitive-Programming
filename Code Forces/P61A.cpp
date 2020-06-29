  


    /*
    ------------------------------|بسم الله الرحمن الرحيم|------------------------------
    ------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------
    __________________________________ShahnawazShaikh___________________________________
     */         

#include<iostream>
#include<vector>
using namespace std;

int main(){
string a,b;
cin>>a>>b;
string s="";
int i;
for(i=0;i<a.length();i++){
	char ch1=a[i];
	char ch2=b[i];
    int n1=abs(48-ch1);
    int n2=abs(48-ch2);
    int p=n1^n2;
    s=s+to_string(p);
}
cout<<s;
 return 0;	
}