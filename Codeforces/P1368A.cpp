#include "bits/stdc++.h"
using namespace std;
#define int int64_t
#define mod 1000000007
#define t() int tst;cin>>tst;for(int test=1;test<=tst;++test)
#define rep(i,a,b) for(i=a;i<b;++i)
#define repr(i,a,b) for(i=a;i>=b;--i)
typedef pair<int,int> pii;
#define F first
#define S second
#define pb push_back
#define all(p) p.begin(), p.end()

int pw(int x,int y){ if(y==1)return x; if(y==0)return 1; int temp=pw(x,y/2); 
    temp*= temp; if(y&1)temp*=x; return temp;}

const int mx = 1e6 + 1;


int32_t main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    t()
    {
        int a,b;
        cin>>a>>b;
        int n;
        cin>>n;

        int count = 0;
        while(a <= n && b <= n)
        {
            if(a > b)
            {
                b += a;
            }
            else
            {
                a+=b;
            }
            count++; 
        }

        cout << count << endl;

    }
    return 0; 
} 



