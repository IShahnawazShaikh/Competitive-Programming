
public class ColumnRowWiseSearch {
 private static int func(int ar[],int x) {
  // System.out.println(left+" "+right);
   int left=0;
   int right=ar.length-1;
   while(right>=left) {
     int mid=(left+right)/2;
     if(ar[mid]==x) return mid;
     else if(ar[mid]>x) right-=1;
     else left+=1;
    } 
   return -1;
  
}	
public static int solve(int[][] ar, int x) {
   int ans=Integer.MAX_VALUE;
   int n=ar.length;
   int i;
   boolean st=false;
   for(i=0;i<n;i++) { 
   
	int p=func(ar[i],x);
    if(p!=-1) {
      st=true;	
      ans=Math.min(ans,(i+1)*1009+(p+1));	
    }
   }
   
   return (st)? ans: -1;
 }

	public static void main(String[] args) {
	 int ar[][]= { 
			  {1,2,3},
			  {4,1,6},
			  {2,2,9}
	    };
	System.out.println( solve(ar,10));
		

	}

}
