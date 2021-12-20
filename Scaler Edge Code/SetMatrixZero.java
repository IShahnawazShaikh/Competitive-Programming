import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SetMatrixZero {
	private static void setZeroes(ArrayList<ArrayList<Integer>> al) {
		
		System.out.println(al);
		int i,j;
		boolean st=false;
	     TreeSet<Integer> tRow=new TreeSet<Integer>();
	     TreeSet<Integer> tCol=new TreeSet<Integer>();
	     for(i=0;i<al.size();i++) {
		 st=false;
		 ArrayList<Integer> list=al.get(i);
		 for(j=0;j<list.size();j++) {
   
		 if(list.get(j)==0) {
		   st=true;
		   tCol.add(j); 
		}		 
	  }
	 if(st) tRow.add(i);
	}
		
 System.out.println(tRow+" "+tCol);
 
 
 ArrayList<Integer> row=new ArrayList<Integer>(tRow);
 ArrayList<Integer> col=new ArrayList<Integer>(tCol);
		
 int p=0;
	
	for(i=0;i<al.size();i++) {
    if( p<row.size()) {
	 if(i==row.get(p)) {
		 ArrayList<Integer> list=al.get(i);
		 Collections.fill(list,0);
		 p+=1;
		 continue;
	 }
    }
	ArrayList<Integer> list=al.get(i);
	 int q=0;
	 for(j=0;j<list.size();j++) {
	    if(q<col.size() ) {
		 if(j==col.get(q)) {
		 
		  list.set(col.get(q),0);
		  System.out.println("index "+col.get(q));
		  q+=1;	
	    } 
	 }
   }
 }
System.out.println(al);
	
		
}
public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> temp=new ArrayList();
		temp.add(0);
		temp.add(0);
		//temp.add(1);
		al.add(temp);
		//temp.clear();
		ArrayList<Integer> temp1=new ArrayList();
		temp1.add(1);
		temp1.add(1);
		//temp1.add(1);
		al.add(temp1);
		//temp.clear();
//		ArrayList<Integer> temp2=new ArrayList();
//		temp2.add(1);
//		temp2.add(0);
//		temp2.add(1);
//		al.add(temp2);
//		//temp.clear();
		
		setZeroes(al);
	}

}
