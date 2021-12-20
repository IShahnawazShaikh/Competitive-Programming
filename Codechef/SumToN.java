/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/
import java.io.*;
import java.util.*;
class SumToN{
	public static void main(String[] x) throws java.lang.Exception{
	Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
    
    while(t>0){
    
    int num=sc.nextInt();
    int sum=0;
    while(num>0){
    sum+=num%10;
    num/=10;
    }  
   System.out.println(sum);
    t--;	
    }
	

	}

}