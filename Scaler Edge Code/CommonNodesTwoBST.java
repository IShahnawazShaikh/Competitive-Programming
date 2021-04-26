import java.util.Stack;

public class CommonNodesTwoBST {
    public static int solve(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack1=new Stack<>();
         Stack<TreeNode> stack2=new Stack<>();
         int MOD=1000000007;
         long ans=0;
         
         while(true){
           if(root1!=null){
             stack1.push(root1);
             root1=root1.left;
           }
          else if(root2!=null){
             stack2.push(root2);
             root2=root2.left;
           }
          
          else if(!stack1.isEmpty() && !stack2.isEmpty()){
             root1=stack1.peek();
             root2=stack2.peek();
             
             if(root1.val==root2.val){
               ans+=root1.val;
               ans%=MOD;
               stack1.pop();
               stack2.pop();
               root1=root1.right;
               root2=root2.right;
             }
           else if(root1.val> root2.val){
              stack2.pop();
              root2=root2.right;
              root1=null;
           }
           else {
              stack1.pop();
              root1=root1.right;
             // root2=null;     //no need to null because if will run without this 
            }
          }
          else break;
           
         }
       return (int)(ans%MOD);    
     }
	public static void main(String[] args) {
		TreeNode h1=new TreeNode(2);
        TreeNode h2=new TreeNode(1);
        TreeNode h3=new TreeNode(3);
        
        h1.left=h2;
        h1.right=h3;
        
        TreeNode h4=new TreeNode(5);
        TreeNode h5=new TreeNode(2);
        TreeNode h6=new TreeNode(9);
        TreeNode h7=new TreeNode(3);
        
        h4.left=h5;
        h4.right=h6;
        h5.right=h7;
        solve(h1,h4);
        
	}

}
