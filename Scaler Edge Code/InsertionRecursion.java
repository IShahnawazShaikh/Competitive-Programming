public class InsertionRecursion {
    public static int insertion(int ar[]){
     int i,j,swap=0,n=ar.length;
      for(i=1;i<n;i++){
    	sort(ar,i);
      }
    for(i=0;i<n;i++)  System.out.print(ar[i]+" ");
    return swap;	
  }
  public static void sort(int ar[],int i){
	  if(i==0 || ar[i]>=ar[i-1]) return;
	  ar[i]=(ar[i]+ar[i-1])-(ar[i-1]=ar[i]);
	  sort(ar,i-1);
  }
  public static void main(String[] args) {
	  insertion(new int[]{3,1,4,-2,0});
   }
}
