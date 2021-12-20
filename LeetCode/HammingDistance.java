
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int i,cnt=0;
        int n=Math.max(x,y);
        for(i=0;i<31;i++){
        	if((x&1)!=(y&1)) cnt+=1;
        	x>>=1;
        	y>>=1;
         }
        System.out.println("ans: "+2*cnt);
         return cnt; 
      }
	public static void main(String[] args) {
	   
		hammingDistance(1,4);
	}

}
