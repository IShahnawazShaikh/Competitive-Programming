import java.util.*;
public class P1454B {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int test=sc.nextInt();
 while(test>0) {
 int i,n;
 n=sc.nextInt();
 int ar[]=new int[n];
 Map<Integer,Integer> mp=new HashMap<Integer,Integer>();  
for(i=0;i<n;i++){
   ar[i]=sc.nextInt();
   if(mp.containsKey(ar[i])){
     mp.put(ar[i],mp.get(ar[i])+1);
   }
   else{
     mp.put(ar[i],1);
   }
 }
if(n==1) System.out.print(1);
else if(mp.size()==1) System.out.print(-1);
else{
  int key=Integer.MAX_VALUE;
  for(Map.Entry<Integer,Integer> mp1: mp.entrySet()){
  	if(mp1.getValue()==1){
      if(key>mp1.getKey()) key=mp1.getKey();
  	}
  }

 if(key==Integer.MAX_VALUE) System.out.print(-1);
 else{
 	for(i=0;i<n;i++){
 		if(key==ar[i]){
 			System.out.print(i+1);
 			break;
 		}
 	}
 }

}
System.out.println(); 	
test-=1; 
 }
}

}
