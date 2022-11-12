package sortingOfObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {

    int rollno;
    String name, address;
	int age;
 
    public Students(int rollno, String name, int age, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString()
    {
        return this.rollno + " " + this.name + " " + this.age + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Students> {
    public int compare(Students a, Students b)
    {
        return a.rollno - b.rollno;
    }
}
 
class Sortbyname implements Comparator<Students> {
    public int compare(Students a, Students b)
    {
 
        return a.name.compareTo(b.name);
    }
}
//sort according to the student name and secondly, sort according to student age.
class SortbynameAndAge implements Comparator<Students> {

public int compare(Students a,Students b)
{

    int nameCompare = a.name.compareTo(b.name);

    int ageCompare = a.age - b.age;

    // 2nd level comparison
    return (nameCompare == 0) ? ageCompare: nameCompare;
}
}
public class Comparator_Example3 {

	public static void main(String[] args) {

        ArrayList<Students> ar = new ArrayList<Students>();
        ar.add(new Students(111, "Mayank",24, "london"));
        ar.add(new Students(112, "Mayank",20, "Indiana"));
        ar.add(new Students(131, "Anshul", 25, "nyc"));
        ar.add(new Students(121, "Solanki",30, "jaipur"));
        ar.add(new Students(101, "Aggarwal",45, "Hongkong"));
 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
 
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");

        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        
        //Sorting by name and then age
        
         Collections.sort(ar,new SortbynameAndAge());

        System.out.println("\n\nAfter Sorting by name and then age:\n");

        for (Students std : ar) {
            System.out.println(std);
        }
        

	}

}
