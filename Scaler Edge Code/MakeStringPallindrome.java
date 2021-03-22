
public class MakeStringPallindrome {
  public static int solve(String A){
	StringBuilder revString=new StringBuilder(A);
	
	String text=A+'$'+revString.reverse();
	System.out.println(text);
	
	int i,n=text.length();
	int z[]=new int[n];
	initializeZArray(text,z); 
	for(i=0;i<n;i++) System.out.print(z[i]+" ");
	int ans=Integer.MIN_VALUE;
	for(i=0;i<n;i++){
	  if(z[i]+i==n){
		ans=Math.max(ans,z[i]);  
	  }
	}
	System.out.println();
	System.out.println(ans +" "+(A.length()-ans));
	
	return 0;  
  }
  private static void initializeZArray(String s, int[] z) {
	   int i,n=s.length();
	   int p=0,l=0,r=0;
	   for(i=1;i<n;i++){
	   if(i>r){
	     l=i;
		 r=i;
		 p=0;
		 while(r<n && s.charAt(p)==s.charAt(r)){
		    p++; r++;	
		 }
		 r--;	
		z[i]=r-l+1;	
	   }
	   else{
		  int k=i-l;
		  if(z[k]<r-i+1) z[i]=z[k];
		  else{
			 l=i;
			 p=r-l;
			 while(r<n && s.charAt(p)==s.charAt(r)){
				p++; r++; 
			 }
			 r--;
			 z[i]=r-l+1;
		  }
	   }
	  }
	 } 
  public static void main(String[] args) {
	 solve("abc");
  }
}
