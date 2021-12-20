	
	public class Teams {
		 public static int solve(String s) {
			int i,ans=0;
			int TOne=0,TZero=0;
			for(i=0;i<s.length();i++){
			 if(s.charAt(i)=='1') TOne+=1;
			 else TZero+=1;
			}
			int one=0,zero=0;
			for(i=0;i<s.length();i++){
			  if(s.charAt(i)=='1') one+=1;
			  else zero+=1;
			  if(one==zero){
				if(TOne-one==TZero-zero) ans+=1; 
			  }
			}
			return ans; 
		 }
		public static void main(String[] args) {
			
	      System.out.println(solve("011100"));
		}
	
	}
