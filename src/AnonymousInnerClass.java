
class Popcorn{
	public void show() {
		System.out.println("show-01");
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
}

public class AnonymousInnerClass {

	
	
	public static void main(String...x) {
		 
		Popcorn p=new Popcorn() {
			
			public void show() {
				System.out.println("show-02");
			}
			
			public void print() {
				System.out.println("print");
			}
		};
		p.print();
		
	}
}
