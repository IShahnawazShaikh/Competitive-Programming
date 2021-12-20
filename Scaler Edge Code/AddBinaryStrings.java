
public class AddBinaryStrings {
  public static String addBinary(String A, String B) {
     int i,n=A.length(),m=B.length();
     
     String ans="";
     boolean carry=false;
     
     for(i=0;i<n-m;i++){
    	B='0'+B; 
     }
     for(i=0;i<m-n;i++){
    	A='0'+A; 
     }
     int p1=A.length()-1,p2=A.length()-1;
     
     while(p1>=0 && p2>=0){
      if((A.charAt(p1)=='0' && B.charAt(p2)=='1') || (A.charAt(p1)=='1' && B.charAt(p2)=='0')){ 
    	 if(carry){
    	   ans='0'+ans;
    	   carry=true;
    	 }
    	 else{
    		ans='1'+ans; 
    	 }
      }
      else{
    	 if(carry){
    		  ans='1'+ans;
    		  if(A.charAt(p1)=='1' && B.charAt(p2)=='1'){
    			  carry=true;
        	  }
        	  else{
        		  carry=false;
        	 }	 
    	 }
    	 else{
    	  ans='0'+ans;	 
    	  if(A.charAt(p1)=='1' && B.charAt(p2)=='1'){
    		  carry=true;
    	  }
    	 } 
      }
      p1-=1;
      p2-=1;
     }
     if(carry) ans='1'+ans; 
     System.out.println(ans);
     return ans;
   }
  public static void main(String[] args) {
	  addBinary("100","001");	

  }

}
