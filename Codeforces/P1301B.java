/*
------------------------------|بسم الله الرحمن الرحيم|----------------------------------------------
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"---------------*/
//Factors API
import java.util.Scanner;
import java.util.*;
public class P1301B{
public static void main(String... x){
  System.out.println("Insert: ");
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t>0) {
   
  int n=sc.nextInt();
  int i;
  int ar[]=new int[n]; 
  for(i=0;i<n;i++) ar[i]=sc.nextInt();
  int max=0;
  int min=1000000000;
  for(i=0;i<ar.length-1;i++) {
	if(ar[i]==-1 && ar[i+1]!=-1) {
	    if(ar[i+1]>max) max=ar[i+1];
	    if(ar[i+1]<min) min=ar[i+1];
	    i+=1;
	}
	else if(ar[i]!=-1 && ar[i+1]==-1) {
		if(ar[i]>max) max=ar[i];
	    if(ar[i]<min) min=ar[i];
	}
  }
// System.out.println(max+" "+min);
  int k=(min+max)/2;
  //System.out.println(k);
  int ans=-1000000000;
  if(ar[0]==-1) ar[0]=k;
  for(i=1;i<n;i++) {
  if(ar[i]==-1) ar[i]=k;	
	ans=Math.max(ans,Math.abs(ar[i]-ar[i-1]));  
  }
  System.out.println(ans+" "+k);
 
  t-=1; 
  } 
 }
}