import java.util.ArrayList;

public class AlternatePositiveNegative {
 public static int[] solve(int[] ar) {
	 int i,n=ar.length;
	 ArrayList<Integer> negative=new ArrayList<Integer>();
	 ArrayList<Integer> pos=new ArrayList<Integer>();
	 for(i=0;i<n;i++){ 
		 if(ar[i]<0) negative.add(ar[i]);
		 else pos.add(ar[i]);
	 }
	 if(negative.size()==0) return ar;
	 else if(negative.size()==n) return ar;
	 else{
	  boolean st=true;
	  int posI=0,negI=0;
	  int Nsz=negative.size();
	  int Psz=pos.size();
	  for(i=0;i<n;i++){
		 if(st){
		   ar[i]=negative.get(negI);
		   negI+=1;
		   Nsz-=1;
		   st=false;
		 }
		 else{
			ar[i]=pos.get(posI);
			posI+=1;
			Psz-=1;
			st=true;
		 }
		 if(Psz==0) st=true;
		 else if(Nsz==0) st=false;
	  }
		 
	 }
	 //for(i=0;i<n;i++) System.out.print(ar[i]+" ");
	 return ar;
	 
  }
  public static void main(String[] args) {
	  solve(new int[]{-1,-2,-3,-4,-5});
	}

}
