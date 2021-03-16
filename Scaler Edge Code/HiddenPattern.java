
public class HiddenPattern {
  public static int solve(final String text, final String pattern) {
     int i,n=text.length();
     int m=pattern.length();
     String s=pattern+'$'+text;
   
     int z[]=new int[s.length()];
     z[0]=pattern.length();
     calculateZArray(z,pattern,1);  //for pattern
     calculateZArray(z,s,pattern.length()+1); //for pattern+'$'+text
	  
     //for(i=0;i<z.length;i++) System.out.print(z[i]+" ");
     int ans=0; 
     for(i=pattern.length()+1;i<z.length;i++) {
    	if(z[i]==pattern.length()) ans+=1; 
     }
     System.out.println(ans);
	 return 0; 
  }
  public static void calculateZArray(int[] z,String s,int index){  
   int i;
   int n=s.length();
   int p1=0,l=0,r=0;
   for(i=index;i<n;i++){	   
	 if(i>r){
	  l=i;r=i;
	  p1=0;
	  while(r<n && s.charAt(r)==s.charAt(p1)){
	   r++; p1++;	  
	  }
	  r-=1;   //computed 1 extra;
	  z[i]=r-l+1;
	  
	 }
	 else{
	   
	  int j=i-l;
	  if(z[j]<r-i+1){
		z[i]=z[j];  
	  }
	  else{
		 l=i;
		 p1=r-l;
		 while(r<n && s.charAt(r)==s.charAt(p1)){ 
		 p1++; r++;
		   
		 }
		 r-=1;
		 z[i]=r-l+1;
	  } 
	 }
   }
  }
  public static void main(String[] args) {
	  solve("abababa","aba");

  }

}
