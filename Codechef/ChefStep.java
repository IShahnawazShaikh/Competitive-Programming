/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/
import java.io.*;
import java.util.*;
class Codechef{
	public static void main(String[] x) throws java.lang.Exception{
	Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();

    while(t>0){
     int n=sc.nextInt();
     int k=sc.nextInt();
     String ans="";
     for(int i=0;i<n;i++){
        int temp=sc.nextInt();
        if(temp%k==0)
           ans=ans+"1";
        else
          ans=ans+"0";
           
	 }
   System.out.println(ans);
	 t--;
     }
    }

}