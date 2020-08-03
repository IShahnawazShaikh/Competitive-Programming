import java.util.Scanner;
import java.util.*;
class LuckyFour{
public static void main(String[] x){
	new Thread(()->{
	Scanner sc=new Scanner(System.in);
    int i;
	int test=sc.nextInt();
	while(test>0){
     String s =sc.next();
     int cnt=0;
     for(i=0;i<s.length();i++){
      char ch=s.charAt(i);	
      if(Character.compare(ch,'4')==0)
          cnt+=1;
     }
     System.out.println(cnt);
     test--;
	}
	  }).start();
   }
}