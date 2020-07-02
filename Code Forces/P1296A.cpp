  /*
	    ------------------------------|بسم الله الرحمن الرحيم|------------------------------//
	    ------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
	    __________________________________ShahnawazShaikh_____________________________________
	 */
	#include<iostream>
	#include<vector>
	using namespace std;
	#define int int64_t
	int32_t main(){
	 ios_base::sync_with_stdio(false);
	 cin.tie(NULL);	
	 int t;
	 cin>>t;
	 while(t>0){
	 int i,n;
	 cin>>n;
	 int sum=0,odd=0,even=0;
	 vector<int> v(n);
     for(i=0;i<n;i++){
     	cin>>v[i];
     }
     for(i=0;i<n;i++){
     	if(v[i]%2==0)
     		odd+=1;
     	else
     		even+=1;
     	sum+=v[i];
        
     }
     if(sum%2!=0)
     	cout<<"YES";
     else{
     	if(odd!=0 & even!=0)
     	     cout<<"YES";
     	 else
     	 	cout<<"NO";
	 }
	 cout<<endl;	
	 t--;
	 }
	 return 0;	
	}