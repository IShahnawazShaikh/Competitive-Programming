public class PowerOf2Integer {
    public static int isPower(int A) {
      if(A==1) return 1;
      int i,k=(int)Math.sqrt(A);
      for(i=2;i<=k;i++){
    	 int p=A; 
         if(p%i==0){
        	 System.out.println(i+": ");
        	 System.out.println();
            while(p%i==0){
            	System.out.println(A+" ");
                p/=i;
            }
          if(p==1) return 1;
         // else { System.out.println(A+" "+i);  return 0;}
         }  
      }
      return 0;
    }
    public static void main(String...x){
     
    System.out.println(isPower(1024000000));
    }
}
