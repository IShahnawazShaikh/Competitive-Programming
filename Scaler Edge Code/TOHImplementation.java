
public class TOHImplementation {
  
	public static void towerOfHanoi(int n,char from,char to,char aux){
	 if(n==0) return;
	 towerOfHanoi(n-1,from,aux,to);
	 System.out.println(n+" : "+from+" -> "+to);
	 towerOfHanoi(n-1,aux,to,from);
	}
	
	public static void main(String...c){
		towerOfHanoi(3,'A','C','B');
	}
}
