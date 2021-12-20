public class Solution {
     public String solve(int A, int B, int n, int rad, int[] xcor, int[] ycor) {
     if(A==0 || B==0) return "NO";     
     int[][] rec=new int[A+1][B+1];
     int[] p={-1,1,0,0,-1,-1,1,1};
     int[] q={0,0,1,-1,-1,1,1,-1};
     
     int i,j,k;
     
     for(i=0;i<=A;i++){
      for(j=0;j<=B;j++){
        for(k=0;k<n;k++){
         if(Math.sqrt(Math.pow(xcor[k]-i,2)+Math.pow(ycor[k]-j,2))<=rad){
          rec[i][j]=-1;   
         }      
        }
      }     
     }
     if(rec[0][0]==-1) return "NO";
     if(dfs(rec,0,0,p,q)) return "YES"; 
     
     return "NO";   
    }
    public boolean dfs(int[][] rec,int xs,int ys,int[] p,int[] q){
   
      if(xs==rec.length-1 && ys==rec[0].length-1) return true;
      rec[xs][ys]=-1;
      for(int i=0;i<8;i++){
        int x=xs+p[i];
        int y=ys+q[i];
        if(x>=0 && x<rec.length && y>=0 && y<rec[0].length && rec[x][y]!=-1) {
          if(dfs(rec,x,y,p,q)) return true;
        }
      }
      return false;
         
    }
}
