
public class QuickLomuto {
 public static void solve(int ar[]){
   quick(ar,0,ar.length-1);	
   for(int i=0;i<ar.length;i++) System.out.print(ar[i]+" ");
 }
 public static void quick(int ar[],int low,int high){
   
  if(low>high) return;
  int pos=lumotPartition(ar,low,high);
  quick(ar,low,pos-1);
  quick(ar,pos+1,high);
 }
 
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
	 return window+1; 
  }
 public static void main(String...x){
	solve(new int[]{3,2,8,6,1,7,5,4,2}); 
 }
}
