package setsAndmap;

class Pen{
	int price;
	String color;
	Pen(int price, String color){
		this.price = price;
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pen that = (Pen) obj;
		boolean isEqual = this.price == that.price && this.color.equals(that.color);
		return isEqual;
	}
	@Override
	public int hashCode() {
		return price + color.hashCode();
	}
	//String.hashCode() returns a hash code for string
}

public class EqualsAndHashCodeMethods {

	public static void main(String[] args) {
		
		Pen pen1 = new Pen(10,"black");
		Pen pen2 = new Pen(10,"black");
		System.out.println(pen1==pen2); //false
		System.out.println(pen1.equals(pen2)); //false; true when isEquals method overridden
		//false b/c objects pen1 and pen2 have different locations in memory or different references
		
		//We want if the price and color of two pens are same 
		

	}

}

//NOTE: Object class defined equals() method like this:
//	public boolean equals(Object obj) {
//    return (this == obj);
//}
