import java.util.ArrayList;

public class SingleNumberIII {
	 public static int[] singleNumber(final int[] A) {
	   
		 int i;
		 int ans=0;
		 for(i=0;i<A.length;i++) ans^=A[i];
	
		 int p=0;
		 while((ans&1)!=1){
			 ans>>=1;
		     p+=1;
		 } 
		 ArrayList<Integer> list1=new ArrayList<Integer>();
		 ArrayList<Integer> list2=new ArrayList<Integer>();
		 
		 for(i=0;i<A.length;i++){
			 if(((A[i]>>p)&1)==1) list1.add(A[i]);
			 else list2.add(A[i]); 
		 }
		 
//		 System.out.println(list1);
//		 System.out.println(list2);
		 ans=0;
		 p=0;
		 for(i=0;i<list1.size();i++) ans^=list1.get(i);
		 
		 for(i=0;i<list2.size();i++) p^=list2.get(i);
		 
		  
		System.out.println(ans+" "+p);
		 
		 if(ans>p) return new int[]{p,ans};
		 else return new int[]{ans,p}; 
	 }
	public static void main(String[] args) {
		singleNumber(new int[]{1, 2, 3, 1, 2, 5});

	}

}
