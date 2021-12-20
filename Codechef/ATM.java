/*
------------------------------|بسم الله الرحمن الرحيم|------------------------------//
------------"IN THE NAME OF ALLAH, THE MOST GRACIUOS, THE MOST MERCIFUL"-------------//
__________________________________ShahnawazShaikh_____________________________________
*/
import java.io.*;
import java.util.*;
class ATM{
	public static void main(String...p){
	 Scanner sc=new Scanner(System.in);
     int x=0;
     double y=0.0;
     try{
     	x=sc.nextInt();
        y=sc.nextDouble();
     }
     catch(Exception e){}
     if(x%5==0 && x+0.50 <=y){
         System.out.println(y-x-0.50);
      }
      else
         System.out.println(y);
	}

}