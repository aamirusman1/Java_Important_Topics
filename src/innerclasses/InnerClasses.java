package innerclasses;
/*
 * - Advantages:
 *    # We have created our main class and we need to use another class for it,so we can write 
 *      this class inside the our main class (It's a way of logically grouping the classes that are only used at one place.)
 *    # We can't make the outer class private or protected but we can make the inner class
 *      as private or protected. If the inner class is private no one except the outer class can access it.
 *      So it increases encapsulation (hiding from the outer world).
 *    # It leads to more readable and maintainable code.
 *      
 * - We can not have a static method in a nested inner class because an inner class 
 *   is implicitly associated with an object of its outer class 
 *   so it cannot define any static method for itself. 
 */
    class Outer{   //Outer.class
	int a;
	public void show() {
		System.out.println("Outer class method");
	}
	class Inner{   //Outer$Inner.class
		int b;
		public void display() {
			System.out.println("Inner class method");
		}
		public void display1() {
			System.out.println("Another Inner class method");
		}
	}
	static class Inner2{
		public void display2() {
			System.out.println("static Inner class method");
		}
	}
}

public class InnerClasses {   

	public static void main(String[] args) {
		
		Outer outerObject = new Outer();
		System.out.println(outerObject.a);
		outerObject.show();
		//Question: How do we access methods of inner classes?
		//When the inner class is not static
		Outer.Inner innerObject = outerObject.new Inner();
		innerObject.display();
		Outer.Inner innerObject1 = new Outer().new Inner();
		innerObject1.display1();
		//When the inner class is static
		Outer.Inner2 innerObject2 = new Outer.Inner2();
		innerObject2.display2();

	}

}
