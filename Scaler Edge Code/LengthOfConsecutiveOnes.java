
public class LengthOfConsecutiveOnes {
    private static int solve(String s) {
        int i,max=0;
        int n=s.length();
        int count=0,temp=0;
        for(i=0;i<n;i++) {
         if(s.charAt(i)=='1') {
        	 count+=1;
        	 temp+=1;
         }
         else {
        	 max=Math.max(temp,max);
        	 temp=0;
         }
        }
        max=Math.max(temp,max);
        
        int left[]=new int[n];
        int right[]=new int[n];
        
        left[0]=s.charAt(0)-'0';
        right[n-1]=s.charAt(n-1)-'0';        
        for(i=1;i<n;i++) {
        	if(s.charAt(i)=='1') left[i]=1+left[i-1];
        	else  left[i]=0;
        }
        for(i=n-2;i>=0;i--) {
        	if(s.charAt(i)=='1') right[i]=1+right[i+1];
        	else  right[i]=0;
        }        
        for(i=1;i<n-1;i++) {
        if(s.charAt(i)=='0') {
        	int sum=left[i-1]+right[i+1];
        	if(count>sum) max=Math.max(sum+1,max);
        	else max=sum;
        }	
       }
    return max;
    }
	public static void main(String[] args) {
	 
		System.out.println(solve("010100110101"));
	}

}
