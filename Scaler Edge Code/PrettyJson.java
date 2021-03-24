import java.util.ArrayList;

public class PrettyJson {
    public static ArrayList<String> prettyJSON(String A) {
        int i,n=A.length();
        ArrayList<String> list=new ArrayList<String>();
        String tab="";
        String current="";
        for(i=0;i<n;i++){
         if(A.charAt(i)=='{' || A.charAt(i)==']'){
        	if(current.length()>0){
        		list.add(tab+current);
        	}
        	list.add(tab+""+A.charAt(i));
        	tab+="\t";
         }
        
        
        }
        return list;    
       }
	public static void main(String[] args) {
		ArrayList<String> list=prettyJSON("{A:'B'}");
		
		for(String str: list){
		   System.out.println(str);	
		}
		
		
	}

}
