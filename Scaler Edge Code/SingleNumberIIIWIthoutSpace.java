
public class SingleNumberIIIWIthoutSpace {
	public static int[] singleNumber(int[] nums) {
	int i,ans=0,n=nums.length;
	for(i=0;i<n;i++) ans^=nums[i];
	
	int p=0;
	while((ans&1)!=1){
	  ans>>=1;
	  p+=1;
	}
	
	
	int num1=0,num2=0;
	for(i=0;i<n;i++){
	 if((nums[i]&(1<<p))>0) num1^=nums[i];	
	 else num2^=nums[i];	
	}
	
	
	System.out.println(num1+" "+num2);
	return new int[]{};
      
	}

	public static void main(String[] args) {
		singleNumber(new int[]{1,2,1,3,2,5});
	}

}
