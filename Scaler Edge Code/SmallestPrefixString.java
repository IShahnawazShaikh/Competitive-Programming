
public class SmallestPrefixString {
  public String smallestPrefix(String A, String B) {
	int p1=0,p2=0,n=A.length(),m=B.length();
	String ans="";
	while(p1<n && p2 <m){
	 if(A.charAt(p1)==B.charAt(p2)){
	   if(p1==p2) ans=ans+A.charAt(p1)+B.charAt(p2); 
	   else ans=ans+A.charAt(p1);
	   p1++;
	   p2++;
	  }
	 else if(A.charAt(p1)<B.charAt(p2)){ 
	  ans=ans+A.charAt(p1);
	  p1++;
     }
	 else{
      ans=ans+B.charAt(p2);
      p2++;
     }
	 if(p1>=1 && p2 >=1) break;
	}
        
   if(p1==0) ans=ans+A.charAt(p1);
   else if(p2==0)ans=ans+B.charAt(p2);
   
   return ans;
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
