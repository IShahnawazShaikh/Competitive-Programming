
public class QuickHoore {
  public static void solve(int ar[]){
   quick(ar,0,ar.length-1);	
   for(int i=0;i<ar.length;i++) System.out.print(ar[i]+" ");
  }	
  public static void quick(int ar[],int low,int high){   
   if(low<high){
   int pos=hoorPartition(ar,low,high);
   quick(ar,low,pos);
   quick(ar,pos+1,high);
   }
  } 
 public static int hoorPartition(int ar[], int low, int high) {
		int p1 = low - 1;
		int p2 = high + 1;
		int pivot = ar[low];
		while (true) {
			do {
				p1 += 1;
			} while (ar[p1] < pivot);
			do {
				p2 -= 1;
			} while (ar[p2] > pivot);

			if (p1 >= p2)
				return p2;
			ar[p1] = (ar[p2] + ar[p1]) - (ar[p2] = ar[p1]);
		}
	}
	 public static void main(String...x){
			solve(new int[]{3,2,8,6,1,7,5,4,2}); 
		 }

}

