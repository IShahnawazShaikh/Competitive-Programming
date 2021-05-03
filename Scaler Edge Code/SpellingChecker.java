
public class SpellingChecker {
    
    static class TrieNode{
     TrieNode[] child=new TrieNode[26];
     int isEnd=0;
     TrieNode(){
        for(int i=0;i<26;i++) child[i]=null;         
     }
    }	
    public int[] solve(String[] A, String[] B) {
     TrieNode root=new TrieNode();
     int i,n=A.length,m=B.length;
     for(i=0;i<n;i++)
       constructTrie(root,A[i]);
     int ans[]=new int[m];
     for(i=0;i<m;i++)
       ans[i]=searchWord(root,B[i]);
     
     return ans;
     
    }
    public int searchWord(TrieNode root,String s){
     int i,n=s.length();
     TrieNode temp=root;
     for(i=0;i<n;i++){
       if(temp.child[s.charAt(i)-'a']==null) return 0;
       
       temp=temp.child[s.charAt(i)-'a'];
     }
     return temp.isEnd;       
    }
    public void constructTrie(TrieNode root, String s){
     int i,n=s.length();
     TrieNode temp=root;
     for(i=0;i<n;i++){
       if(temp.child[s.charAt(i)-'a']==null){
         TrieNode node=new TrieNode();
         temp.child[s.charAt(i)-'a']=node;
       }
       temp=temp.child[s.charAt(i)-'a'];
     }
     temp.isEnd=1;
    } 
	public static void main(String[] args) {
	  	
	  new SpellingChecker().solve(new String[]{"hat", "cat", "rat"},new String[]{"cat", "ball"});	
	}    
     
}
