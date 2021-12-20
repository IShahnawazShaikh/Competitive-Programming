/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/
import java.io.*;
import java.util.*;
class EnormusInput{
	public static void main(String[] x) throws java.lang.Exception{
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int cnt=0;
    while(n>0){
     int temp=sc.nextInt();
     if(temp%k==0)
     	 cnt+=1;
     n--;
     }
     System.out.println(cnt);
	

	}

}