
public class ShortestUniquePrefix {
	
    public static String[] prefix(String[] A) {
     TrieNode root=new TrieNode(1);
      int i,n=A.length;
      for(i=0;i<n;i++){
        constructTrie(root,A[i]);    
      }
      String prefix[]=new String[n];
      for(i=0;i<n;i++){
        prefix[i]=getPrefix(root,A[i]);    
     } 
      
     return prefix;
      
    }
    public static String getPrefix(TrieNode root,String s){
      int i,n=s.length();
      TrieNode temp=root;
      StringBuilder sb=new StringBuilder("");
      for(i=0;i<n;i++){
        sb.append(s.charAt(i));  
        if(temp.child[s.charAt(i)-'a'].count!=1){
         temp=temp.child[s.charAt(i)-'a'];
        }
        else{
         break;
        }
      }      
     return sb.toString(); 
      
    }
    
    public static void constructTrie(TrieNode root,String s){
      int i,n=s.length();
      TrieNode temp=root;
      for(i=0;i<n;i++){
        if(temp.child[s.charAt(i)-'a']==null){
         TrieNode node=new TrieNode(1);
         temp.child[s.charAt(i)-'a']=node;
        }
        else{
         temp.child[s.charAt(i)-'a'].count+=1;
        }
      temp= temp.child[s.charAt(i)-'a'];    
      }
    }

   public static void main(String[] args) {
	   prefix(new String[]{"zebra", "dog", "duck", "dove"}); 
   }   
 }
 class TrieNode{
  int count;
  TrieNode child[]=new TrieNode[26];
  TrieNode(int cnt){
    count=cnt;  
    for(int i=0;i<26;i++) child[i]=null;
  }
}
