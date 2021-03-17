import java.util.HashSet;
import java.util.Set;

public class BoringSubstring {
  public static int solve(String A) {
        Set<Integer> set=new HashSet<>();
        int i,j,n=A.length();
        if(n==1) return 1;
        for(i=0;i<n;i++) set.add((int)A.charAt(i));
        boolean st=false;
        for(i=0;i<n;i++){
        	st=false;
            for(j=A.charAt(i)-2;j>=97;j--){
              if(set.contains(j)){
            	 st=true;
            	 break;
              }
            }
            if(st) continue;
            for(j=A.charAt(i)+2;j<=122;j++){
             if(set.contains(j)){
             st=true;
              break;
             }      	
            }
           if(!st) return 0; 
        }
        
      return 1;  
     }
	public static void main(String[] args) {
	System.out.println(solve("a"));
	}

}
