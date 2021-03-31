class DesignCircularQueue {
    int flag=0;
    int queue[];
    int f=0,r=0;
    int n=0;
    public DesignCircularQueue(int k) {
      queue=new int[k];
       n=k; 
    }
    
    public boolean enQueue(int value) {
       if(f==r && flag==1) return false;
       
       queue[r]=value;
        r=(r+1)%n;
       if(f==r) flag=1; 
       return true; 
    }
    
    public boolean deQueue() {
      
      if(f==r && flag==0)
          return false;
        
        f=(f+1)%n;
        if(f==r)
            flag=0;
        
       return true; 
    }
    
    public int Front() {
        if(f==r && flag==0)
            return -1;
        int front=queue[f];
        return front;
    }
    
    public int Rear() {
     if(f==r && flag==0)
         return -1;
      
      int last=(r-1+n)%n;
      return queue[last];    
        
    }
    
    public boolean isEmpty() {
        if(f==r && flag==0)
            return true;
        return false;
    }
    
    public boolean isFull() {
      if(f==r && flag==1)
          return true;
      return false;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
