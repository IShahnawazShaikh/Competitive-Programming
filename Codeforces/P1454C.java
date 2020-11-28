import java.util.*;
public class P1454C {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0) {  
int i,n;
n=sc.nextInt();
//int ar[]=new int[n];
Map<Integer,List<Integer>> mp=new HashMap<Integer,List<Integer>>();  
for(i=0;i<n;i++){
   int x=sc.nextInt();
   if(mp.containsKey(x)){
    List l=mp.get(x);
    l.add(i);
    mp.put(x,l); 
    
   }
   else{
     List<Integer> l=new ArrayList<Integer>();
     l.add(i);
     mp.put(x,l);
   }
}
//System.out.println(mp);
if(n==1) {
  System.out.println(0); 
  t-=1;
  continue;
}
else if(mp.size()==n){
  System.out.println(1); 
  t-=1;
  continue;
}
else if(mp.size()==1){
  System.out.println(0); 
  t-=1;
  continue;
}
else{
  int ans=Integer.MAX_VALUE;
  for(List<Integer> list: mp.values()){
     int cnt=0;
     int temp=0;
     for(i=0;i<list.size()-1;i++) {
        if(Math.abs(list.get(i)-list.get(i+1))==1) cnt+=1;
      }
     temp=list.size();
     if(list.get(0)==0) temp-=1; 
     if(list.get(list.size()-1)!=(n-1)) temp+=1;
    
     temp=temp-cnt; 
     if(temp<ans) ans=temp;
  }
 System.out.println(ans);
}
t-=1; 
}
}
}
