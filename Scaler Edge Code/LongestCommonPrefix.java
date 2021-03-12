
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] A) {
        
        int p=0,i=0,n=A.length;
        int mn=1000000;
        for(i=0;i<n;i++){
           mn=Math.min(mn,A[i].length());        
        }
        System.out.println(mn);
        String ans="";
        boolean st=true;
        while(p<mn){
        	System.out.println("p: "+p);
           char ch=A[0].charAt(p); 
           for(i=1;i<n;i++){
            if(ch!=A[i].charAt(p)){
               st=false;
               break;
            }
           }
           if(st) ans+=A[0].charAt(p);
           else break;
           p++;
        }
        System.out.println(ans);
        return ans;
           
       }
	public static void main(String[] args) {
		longestCommonPrefix(new String[]{"abcdefgh", "aefghijk", "abcefgh"});
	}

}
