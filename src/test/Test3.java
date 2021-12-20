package test;

public class Test3 {

	
	public static void solve(String s){
		
		int n=s.length();
		
		StringBuilder sb=new StringBuilder("");
		
		int i=0;
		
		while(i<n && s.charAt(i)==32) {
			i+=1;
		}
		int first=i;
		i=n-1;
		
		while(i>=0 && s.charAt(i)==32) {
		   i-=1;	
		}
		
		int sec=i;
		
//		for(i=first;i<=sec;i++) {
//			
//		}
		int p1=0,p2=n-1;
		while(s.charAt(p1)==32 || s.charAt(p2)==32) {
			
		}
		
		
		
			

		
		
	}
	
	
	public static void main(String[] args) {
		solve(" AB  C  ");

	}

}
