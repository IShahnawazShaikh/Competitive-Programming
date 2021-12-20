import java.util.HashMap;
import java.util.Map;

public class MaximumXORSubarray2 {

	public int[] solve(int[] A) {
		int j, i, n = A.length;
		int[] preXor = new int[n + 1];
		preXor[0] = 0;
		for (i = 1; i <= n; i++)
			preXor[i] = A[i - 1] ^ preXor[i - 1];

        TrieNode root=new TrieNode();  
		insert(root, preXor[0]);
		int mx=-1;
		for (i = 1; i <= n; i++) {
           mx=Math.max(mx,findXor(root,preXor[i]));
           insert(root,preXor[i]);
		}

		Map<Integer,Integer> mp=new HashMap<>();
		mp.put(0,0);
		
		int left=-1,right=-1;
		for(i=1;i<=n;i++){
	
		 if(mp.containsKey(mx^preXor[i])){
		  
		  if(left==-1 && right==-1){
			left=mp.get(mx^preXor[i])+1;
			right=i;		  
		  }
		  else{

			if(i-(mp.get(mx^preXor[i])+1)<right-left){
				left=mp.get(mx^preXor[i])+1;
				right=i;  	
			}
			else if(i-(mp.get(mx^preXor[i])+1)==right-left){
			 int mn=Math.min(left,mp.get(mx^preXor[i]));
			 
			 if(mn==mp.get(mx^preXor[i])){
			  left=mp.get(mx^preXor[i])+1;
			  right=i;	 
			 }
		  }	  
		}
 
	  }
     mp.put(preXor[i],i);
	}
		
		
	System.out.println(left+" "+right);	
   int ans[] = new int[2];
   return ans;

  }

	public int findXor(TrieNode root, int x) {
		TrieNode temp = root;
		int i;
		int ans = 0;
		int bit = 0, compBit = 0;
		for (i = 31; i >= 0; i--) {
			bit=0;
			if ((x & (1 << i)) > 0)
				bit = 1;
			compBit = (1 ^ bit);
			if (temp.child[compBit] != null) {
				ans = ans + (1 << i);
				temp = temp.child[compBit];
			} else
				temp = temp.child[bit];
		}
		
	  return ans;

	}

	public void insert(TrieNode root, int x) {
		TrieNode temp = root;
		int i;
		int bit = 0;
		for (i = 31; i >= 0; i--) {
			bit = 0;
			if ((x & (1 << i)) > 0)
				bit = 1;
			if (temp.child[bit] == null) {
				TrieNode node = new TrieNode();
				temp.child[bit] = node;
			}
			temp = temp.child[bit];
		}
	}

	static class TrieNode {
		TrieNode child[] = new TrieNode[2];
		int index;

		TrieNode() {
			for (int i = 0; i < 2; i++)
				child[i] = null;
		}
	}

	public static void main(String[] args) {
		MaximumXORSubarray2 obj = new MaximumXORSubarray2();
		obj.solve(new int[] {33, 29, 18});

	}

}
