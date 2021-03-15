import java.util.HashSet;
import java.util.Set;

public class Sudoku {
 public static int isValidSudoku(final String[] A) {
	    int n=A.length;
		int m=(int)Math.sqrt(n);
		int i=0,j=0,p=0,q=0;
		for(i=0;i<m;i++){
		  for(j=0;j<m;j++){
		    
		    Set<Character> set=new HashSet<Character>();
			 for(p=0;p<m;p++){
			    String s=A[i*3+p]; 
				for(q=0;q<m;q++){
				 if(set.contains(s.charAt(j*3+q))){
					return 0; 
				 }
				 else{
				   if(s.charAt(j*3+q)!='.') set.add(s.charAt(j*3+q));	 
				  }
				}
			 }
		  }
		}
	    for(i=0;i<n;i++){
		  Set<Character> set1=new HashSet<Character>();
		  for(j=0;j<n;j++){
			  if(set1.contains(A[i].charAt(j))){
					return 0; 
				 }
				 else{
				   if(A[i].charAt(j)!='.') set1.add(A[i].charAt(j));	 
				 }
	        }
					 
	      } 
	   for(i=0;i<n;i++){
		  Set<Character> set2=new HashSet<Character>();
		  for(j=0;j<n;j++){
			  if(set2.contains(A[j].charAt(i))){
					return 0; 
				 }
				 else{
				   if(A[j].charAt(i)!='.') set2.add(A[j].charAt(i));	 
				 }
	      }
					 
	     }  
	     return 1; 	   
  }
  public static void main(String[] args) {
	  isValidSudoku(new String[]{ "....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......"});
	}

}
