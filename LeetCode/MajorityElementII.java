class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
      int c1=nums[0],cnt1=1;
      
      int c2=Integer.MIN_VALUE,cnt2=0;
       
      int i, n=nums.length;
      List<Integer> list=new ArrayList<Integer>();
      
       
      for(i=1;i<n;i++){
        
        if(nums[i]==c1) cnt1+=1;
        else if(nums[i]==c2) cnt2+=1;  
        else{
         if(cnt1==0) {c1=nums[i]; cnt1=1;}
         else if(cnt2==0) {c2=nums[i]; cnt2=1;} 
         else {cnt1-=1;  cnt2-=1;}   
           
        }  
            
      }
      int cnt=0;  
      for(int val: nums) if(c1==val) cnt+=1;
        
      if(cnt>n/3) list.add(c1);  
      
      cnt=0;  
      for(int val: nums) if(c2==val) cnt+=1;
        
      if(cnt>n/3) list.add(c2);    
      return list;  
        
    }
}
