import java.util.*;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(int[] A, final int B, final int C) {
     int i,n=A.length;    
     ArrayList<Integer>[] adj=new ArrayList[n+1];
     
     for(i=0;i<n;i++) adj[i]=new ArrayList<Integer>(); 
     
     for(i=0;i<n;i++) adj[A[i]].add(i+1); 
   
     boolean visited[]=new boolean[n+1];
     if(hasPath(adj,C,B,visited)) return 1;
     
     return 0;
    }
    boolean hasPath(ArrayList<Integer>[] adj,int src,int des,boolean[] visited){
     
     if(src==des) return true;
     visited[src]=true;
     ArrayList<Integer> list=adj[src];
     for(int newSrc: list){
      if(visited[newSrc]==false){
        if(hasPath(adj,newSrc,des,visited)) return true;      
      }     
     }
     return false;
     
    }
    public static void main(String args[]) {
      int n=new Solution().solve(new int[]{1, 1, 1, 3, 3, 2, 2, 7, 6 },9,1);
      System.out.println(n);
    }    
    
}
