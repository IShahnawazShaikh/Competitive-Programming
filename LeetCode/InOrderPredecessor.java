
public class InOrderPredecessor {
    public static TreeNode inorderSuccessor(TreeNode Root, TreeNode p) {
        TreeNode root=Root;
        TreeNode predecessor=null;
        while(root!=null){
         if(root.val==p.val){
           if(root.left!=null){
             predecessor=root.left;
             root=root.left;
             while(root.right!=null){
               predecessor=root;
               root=root.right;  
             }

           }
           else{
            root=root.left;
           }
         }
         else if(root.val>p.val){
             root=root.left;
         }
         else{
            predecessor=root;
            root=root.right; 
         }   
        }
       return predecessor; 
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
