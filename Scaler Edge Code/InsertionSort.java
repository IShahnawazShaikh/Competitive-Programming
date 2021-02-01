
public class InsertionSort {
    public static int insertion(int ar[]){
     int i,j,swap=0,n=ar.length;
      for(i=1;i<n;i++){
    	 j=i;
    	 while(j>0 && ar[j]<ar[j-1]){
    		ar[j]=(ar[j]+ar[j-1])-(ar[j-1]=ar[j]);
    		swap+=1;
    		j--;
    	 }
      }
     
    System.out.println(swap);
    
    for(i=0;i<n;i++)  System.out.print(ar[i]+" ");
    	
    return swap;	
    }
	public static void main(String[] args) {
	  insertion(new int[]{3,1,4,2,0});

	}

}
