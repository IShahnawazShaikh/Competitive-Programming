import java.util.*;
public class P735D{
 private static ArrayList<Integer> isPrime=new ArrayList<Integer>();
 private static int index=10000000;	
 private static boolean primes[]=new boolean[index];
 private static void seive(){
  
  int i,j;
  for(i=2;i*i<=1e6;i++){
  	 if(!primes[i]){
  	 	for(j=i*i;j<=1e6;j=j+i) primes[j]=true;
  	 }
  }
  for(i=2;i<=1e6;i++){
  	if(!primes[i]) isPrime.add(i);
  }
  // for(Integer p: isPrime) System.out.println(p); 
}
private static boolean checkPrime(int n){
  if(n<=1e6)
  	return !primes[n];
  for(Integer i: isPrime){
  	 if(i > Math.sqrt(n))
  	 	return true;
  	 if(n%i==0)
  	 	return false;
  }
  return true;
}

 public static void main(String...x){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  seive();
  //System.out.println(checkPrime(37735849));
  int ans=0;
  if(checkPrime(n)) System.out.println(1);
  else if(n%2==0) System.out.println(2);
  else{
   ans+=1;
   n-=2;
   if(checkPrime(n)) ans+=1;
   else ans+=2;
  System.out.println(ans);
  }
 }   
}