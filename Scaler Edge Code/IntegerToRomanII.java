
public class IntegerToRomanII {
    public static String solve(int A){
     StringBuilder ans=new StringBuilder();
     
      int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String[] B = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
      int i;
      for(i=0;i<value.length;i++){
    	 while(A>=value[i]){
    		ans.append(B[i]);
    		A-=value[i];
    	 }
      }
     System.out.println(ans);
     	
     return ans.toString();	
    }
	public static void main(String[] args) {
		solve(90);

	}

}
