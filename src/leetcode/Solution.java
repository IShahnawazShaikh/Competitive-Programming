package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);  // compare (h, k) by h in reverse order; in case of ties compare k
        List<int[]> list = new LinkedList<>();
        
      for(int[] arr: people)
      System.out.println(Arrays.toString(arr));
        
        for(int[] p: people) {
            list.add(p[1], p);
        }
        
       
        
        System.out.println();
        for(int[] l: list) System.out.println(Arrays.toString(l));
        
       // System.out.println(list);
        int[][] ans=list.toArray(new int[people.length][2]);
        

//        
        return ans;
    }
    
	public static void main(String[] args) {
		Solution obj = new Solution();
		int[][] people = { { 7, 0 }, { 7, 1 }, { 6, 1 }, { 5, 0 }, {5, 2 }, { 4, 4 } };
		obj.reconstructQueue(people);

	}
}