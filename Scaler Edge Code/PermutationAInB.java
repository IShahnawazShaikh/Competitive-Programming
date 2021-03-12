
public class PermutationAInB {
	  public static int solve(String A, String B) {
		     int i,m=A.length(),n=B.length();
		     long pattern=0,text=0;
		     long hashArray[]=new long[26];
		     long hashFactor=1;
		     for(i=0;i<26;i++){
		    	 hashArray[i]=('a'+i)*hashFactor;
		    	 hashFactor*=2;
		     }
		     for(i=0;i<m;i++){
		       pattern+=hashArray[A.charAt(i)-'a'];
		       text+=hashArray[B.charAt(i)-'a'];
		     }
		     int ans=0;
		     if(pattern==text) ans+=1;
		     for(i=1;i<=n-m;i++){
		         text=text-hashArray[(B.charAt(i-1)-'a')]+hashArray[(B.charAt(i-1+m)-'a')];
		         if(text==pattern){
		        	System.out.println("if:"); 
		        	
		        	System.out.println(B.charAt(i)+" "+B.charAt(i+1)+" "+B.charAt(i+2)+" "+B.charAt(i+3));
		        	
		        	ans+=1;
		         }
		         
		     }
		     System.out.println(ans);
		     return ans;
		     
		    }
	public static void main(String[] args) {
		solve("aead","bqocqeccebqoqbbccpcqoocpqdcoocaabaeaacoobboabcdbbaepoccpcqcdepocdoaopcbccdooqpa");
	}

}
