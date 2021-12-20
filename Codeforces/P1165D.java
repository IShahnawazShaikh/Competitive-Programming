import java.math.BigInteger;
import java.util.*;
public class P1165D{
private static ArrayList<Long> factors(long num){
		ArrayList<Long> list=new ArrayList<Long>();
		for(long i=2;i*i<=num;i++) {
		 if(num%i==0) {
			 list.add(i);
			 if(i!=num/i) list.add(num/i);
		  }
		 }
		 Collections.sort(list);
		 return list;
		}	
 public static void main(String...x){
   Scanner sc=new Scanner(System.in);

   int t=sc.nextInt();
   while(t>0){
    int n=sc.nextInt();
    int i;
    ArrayList<Long> list=new ArrayList<Long>();
    for(i=0;i<n;i++){
      list.add(sc.nextLong());
    }
    Collections.sort(list);
    long ans=list.get(0)*list.get(n-1);
    for(i=0;i<n;i++){
      if(ans%list.get(i)!=0){
      	ans=-1;
      	break;
      }
    }
    ArrayList<Long>list2=new ArrayList<Long>();
    list2=factors(ans);

   
    
    if(ans==-1) System.out.println(-1);
    else if(list.size()!=list2.size()) System.out.println(-1);
    else System.out.println(ans);	
   	t-=1; 
   }
 }
}