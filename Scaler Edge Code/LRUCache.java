import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Map<Integer,Integer> mp=null;
    Deque<Integer> deque=null;
    int capacity;  
    public LRUCache(int capacity) {
      mp=new HashMap<Integer,Integer>();
      deque=new ArrayDeque<Integer>();    
      this.capacity=capacity;     
    }
    
    public int get(int key) {
      if(mp.containsKey(key)){
       deque.remove(key);
       deque.addLast(key);   
       return mp.get(key);   
      }
      return -1;    
    }
    public void set(int key, int value) {
      if(mp.containsKey(key)) { 
          mp.put(key,value);
          deque.remove(key);
          deque.addLast(key); 
          return;
      }
      if(mp.size()<capacity){
         mp.put(key,value);
         deque.addLast(key); 
      }
     else{
         int p=deque.removeFirst();
         mp.remove(p);
         deque.addLast(key);
         mp.put(key,value);
         
        }        
    }
}
