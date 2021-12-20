import java.util.ArrayList;

public class ColorfulNumber {
	public static int colorful(int A) {
	 
	 ArrayList<Long> list=new ArrayList<Long>();
	 ArrayList<Long> number=new ArrayList<Long>();
	 int temp=A;
	 while(temp > 0){
		long rem=1L*(temp%10);
		if(number.contains(rem)) return 0;
		number.add(rem);
		temp/=10; 
	 }	 
	 int i;
	 list.add(1L*number.get(number.size()-1));
	 int x=0;
	 for(i=number.size()-2;i>=0;i--){
	  list.add(1L*number.get(i)*list.get(x++));
	 }

	 long x2=1;
	 for(i=1;i<list.size();i++){
	  if(number.contains(list.get(i))) {System.out.println("if: "+0);break;}
	  else if(number.contains(list.get(i)/x2)){System.out.println("else if: "+0);break;}
	  x2=list.get(i-1);
	 }
	 
	 System.out.println(1);
	 
	 
	 return 1;	
	}
	public static void main(String[] args) {
	 colorful(99);

	}

}
