/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define ll long long
int32_t main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
ll int n,k,i;
 cin >> n >> k;
 ll int *a=new ll int[n];
	for(i = 0; i < n; ++i)
		cin >> a[i];
	
	vector <ll int> v;
	for(i = 1; i < n; ++i) v.push_back(a[i - 1] - a[i]);
	
	sort(v.begin(), v.end());

	ll int res = a[n - 1] - a[0];
	for(i = 0; i < k - 1; ++i) res += v[i];
	
	cout << res << endl;
 	return 0;
}