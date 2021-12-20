
public class PartitionLomuto {
  public static int lumotPartition(int ar[],int low,int high){
	 int window=low-1;
	 int i,pivot=ar[high];
	 for(i=low;i<high;i++){
	  if(ar[i]<=pivot){
		 window+=1;
		 ar[i]=(ar[window]+ar[i])-(ar[window]=ar[i]);
	  }	 
	 }
	 
	 ar[high]=(ar[window+1]+ar[high])-(ar[window+1]=ar[high]);
	 System.out.println(window+1);
	  
	  for(i=0;i<=high;i++) System.out.print(ar[i]+" ");
	 
	 return window+1; 
  }
  public static void main(String[] args) {
	  lumotPartition(new int[]{10,80,30,90,40,50,70},0,6);

 }
}
