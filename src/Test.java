import java.io.IOException;

interface A {
	interface B {

	}
}

public class Test {
	private int x = 10;

	public void createInnerObject() {

		InnerClass obj = new InnerClass();
		obj.innerShow();
	}

	class InnerClass {
		public void innerShow() {
			System.out.println("innerShow " + x);
		}

	}
	
	public void display() {
		
		final int p=10;
		class Inner2{
			
			private int tt=0;
			
			public void print() {
				System.out.println(x);
			}
			
		}
		
		Inner2 inner=new Inner2();
		inner.print();
		
	}

	public static void main(String[] args) {

		Test t = new Test();
		// t.createInnerObject();
		//Test.InnerClass inner = t.new InnerClass();
		//inner.innerShow();
		t.display();
	}

}
