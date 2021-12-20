

public class InOrderSuccessor {
    public static TreeNode inorderSuccessor(TreeNode Root, TreeNode P) {
        TreeNode root=Root;
        TreeNode succ=null;
        while(root!=null){
              
          if(root.val==P.val){
          
            if(root.right!=null){
               succ=root.right;
               root=root.right; 
               while(root.left!=null){
                 root=root.left;  
               } 
            }
            else root=root.right;
          }
          else if(root.val>P.val){
            succ=root;
            root=root.left;
      
          }
          else{
 
            root=root.right;
          }
         
        }
        return succ;
     }	
	public static void main(String... x) {
	
		TreeNode h1=new TreeNode(2);
        TreeNode h2=new TreeNode(1);
        TreeNode h3=new TreeNode(3);
        TreeNode P=new TreeNode(0);
        h1.left=h2; h1.right=h3;
        TreeNode head=h1;
        inorderSuccessor(head,P);
	}
}
