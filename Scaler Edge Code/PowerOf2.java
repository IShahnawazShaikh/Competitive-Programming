
public class PowerOf2 {
	public static int power(String s) {

    int i,n=s.length();
    if(n==1 &&  s.charAt(0)=='1') return 0;
    String s2="";
    String p="";
	  System.out.println(s+" size: "+n);
     while(n!=1 || (s.charAt(n-1)-'0')!=1){
       if((s.charAt(n-1)-'0')%2==1){
    	  // System.out.println("if:");
    	   return 0;
       }
       else{
    	 // System.out.println("else: ");
    	 boolean true1=false;
    	 for(i=0;i<n;i++){
    		p+=s.charAt(i); 
    	   int num=Integer.parseInt(p);
    	   //System.out.println("num: "+num);
    	   
           if((i+1)<n){
   		     if(s.charAt(i+1)=='0'){
   		      if(num<2) true1=true;
   		    	 continue;
   		     }
   		      
   	      }
   	      if(num<2){
   	    	 if(i!=0){
   	    	    true1=true;	 
   	    	 }
   	    	  
       	    continue; 
           }
           else{
        	// System.out.println("else: "+num);   
             if((num^1)==num+1){
            	 //System.out.println("even");
            	 if(true1) s2=s2+"0"+(num/2);
            	 else s2=s2+(num/2);
            	 p="";
            	 true1=false;
             }
             else{
            	//System.out.println("odd");
            	if(true1) s2=s2+"0"+(num/2);
            	else s2=s2+""+(num/2);
            	 p="1"; 
            	 true1=false;
              }   
            }
    	   }   
    	  s=s2;
    	  n=s2.length();
    	  s2="";  
         System.out.println(s+" size: "+n);
       } 
     }
    
	 return 1;
	}
	public static void main(String...x){
	   System.out.println("ans: "+power("128"));	
	}
}
