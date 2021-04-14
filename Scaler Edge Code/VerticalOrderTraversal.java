import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class VerticalOrderTraversal {
     
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
    ArrayList<ArrayList<Integer>> Ans=new ArrayList<>();    
     if(A==null) return Ans;       
     Map<Integer,ArrayList<Integer>> mp=new TreeMap<>();
     //Queue<Pair> queue=new LinkedList<>();   // uncomment this line
     Queue<Pair> queue=new ArrayDeque<>();
     queue.add(new Pair(A,0));
     while(!queue.isEmpty()){
        Pair P=queue.poll();
        TreeNode root=P.node;
        //if(root==null) continue;
        int line=P.line;
        
        if(mp.containsKey(line)){
          ArrayList<Integer> list=mp.get(line);
          list.add(root.val);
        }
        else{
         ArrayList<Integer> list2=new ArrayList<>();
          list2.add(root.val);
          mp.put(line,list2);
        } 
        if(root.left!=null) queue.add(new Pair(root.left,line-1));
        if(root.right!=null) queue.add(new Pair(root.right,line+1));
        
     }
     for(ArrayList list: mp.values()){
        Ans.add(list); 
     }
     return Ans;
  }
   static class Pair{
        TreeNode node;
        int line;
        Pair(TreeNode node,int line){
          this.node=node;
          this.line=line;
        }
     }   
}

 
