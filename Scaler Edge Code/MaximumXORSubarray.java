
public class MaximumXORSubarray {
	int max = 0;
	int[] B = new int[2];
	public int[] solve(int[] A) {
	     int j,i,n=A.length;     
	     int[] preXor=new int[n+1];
	     preXor[0]=0;
	     for(i=1;i<=n;i++) preXor[i]=A[i-1]^preXor[i-1];
	     
	    // for(i=0;i<=n;i++) System.out.print(preXor[i]+" ");

	     int max=-1,xor=0;
	     int[] B=new int[2];
	     for(i=0;i<n;i++){
	        xor=0; 
	       for(j=i+1;j<=n;j++){
	         xor=(preXor[j]^preXor[i]);
		         if(xor>max){
	           B[0]=i+1;
	           B[1]=j;
	           max=xor;
	         }
	         else if(xor==max){

	            if(j-(i+1)<B[1]-B[0]){
	              B[0]=i+1;
	              B[1]=j;
	    ;	              
	            }
	            else if(j-(i+1)==B[1]-B[0]){
	             int mn=Math.min(i+1,B[0]);
	              if(mn==i+1){
	                B[0]=i+1;
	                B[1]=j;    
	              }
	            }
	         }
	           
	       }     
	     }
	     return B;
	}
//
//	public void findXor(TrieNode root, int x, int index) {
//		TrieNode temp = root;
//		int i;
//		int ans = 0;
//		int bit = 0, compBit = 0;
//		for (i = 31; i >= 0; i--) {
//
//			if ((x & (1 << i)) > 0)
//				bit = 1;
//			else
//				bit = 0;
//			compBit = (1 ^ bit);
//			if (temp.child[compBit] != null) {
//				ans = ans + (1 << i);
//				temp = temp.child[compBit];
//			} else
//				temp = temp.child[bit];
//		}
//		if (ans > max) {
//			B[0] = temp.index;
//			B[1] = index;
//	
//			max = ans;
//			System.out.println("1: "+B[0]+" "+B[1]+" "+ans);	
//		} else if (ans == max) {
//
//			if (index - temp.index < B[1] - B[0]) {
//				B[0] = temp.index;
//				B[1] = index;
//				System.out.println("2: "+B[0]+" "+B[1]+" "+ans);	
//			} else if (index - temp.index == B[1] - B[0]) {
//				int mn = Math.min(temp.index, B[0]);
//				if (mn == temp.index) {
//					B[0] = temp.index;
//					B[1] = index;
//					System.out.println("3: "+B[0]+" "+B[1]+" "+ans);	
//				}
//			}
//		}
//		System.out.println("chevck: "+ans+" "+temp.index);
//		insert(root, ans, temp.index);
//		// return ans;
//
//	}
//
//	public void insert(TrieNode root, int x, int index) {
//		TrieNode temp = root;
//		int i;
//		int bit = 0;
//		for (i = 31; i >= 0; i--) {
//			bit = 0;
//			if ((x & (1 << i)) > 0)
//				bit = 1;
//			if (temp.child[bit] == null) {
//				TrieNode node = new TrieNode(index);
//				temp.child[bit] = node;
//			}
//			temp = temp.child[bit];
//		}
//	}
//
//	static class TrieNode {
//		TrieNode child[] = new TrieNode[2];
//		int index;
//
//		TrieNode(int index) {
//			this.index = index;
//			for (int i = 0; i < 2; i++)
//				child[i] = null;
//		}
//	}

	public static void main(String[] args) {
		MaximumXORSubarray obj= new MaximumXORSubarray();
		obj.solve(new int[]{ 19, 17, 7, 7, 23});

	}

}
