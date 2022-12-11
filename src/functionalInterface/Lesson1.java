package functionalInterface;

@FunctionalInterface
interface A {
	//contains only one abstract method
	void show();
	//can also contain methods of Object class
	String toString();
	
}

class B implements A{
	public void show() {
		System.out.println("hi");
	}
}

public class Lesson1 {

	public static void main(String[] args) {
		/*
		 * Method 1
		 */
		//Want to make object of A => make a class B that implements A and define the abstract method of A inside B
		
		A obj = new B();
		obj.show();
		
		/*
		 * Method 2
		 */
		//A is interface but we can make object of it by defining the method. Here no need of Class B
		//A obj1 = new A(); // cant make object of A 
		A obj = new A() {
			public void show() {
				System.out.println("Hey..");
			}
		};
		obj.show();
		
		/*
		 * Method 3: Through lambda expression
		 */
		A obj1 = ()-> System.out.println("Hey again..");
		obj1.show();
		
		//Note: Here only 1 method to define as functional interface has only one abstract method

	}

}
