package sortingOfObjects;

import java.util.Arrays;
import java.util.Comparator;

//Student class
class Student
{
 // Having name and roll number
 String name;
 int rollNo;

 // Constructor 
 Student(String n, int r)
 {
     name = n;
     rollNo = r;
 }
 
 String getName()
 {
     return name;
 }
 int getRoll()
 {
     return rollNo;
 }
 public String toString()
 {
     return "(" + name + ", " + rollNo + ")";
 }
}

public class Comparator_Example2 {

	public static void main(String[] args) {
		String[] arr = {"gfg", null, "ide", null};

	       
        Arrays.sort(arr, Comparator.nullsFirst(
            Comparator.naturalOrder()));
            
      
        System.out.println(Arrays.toString(arr));
        
        //nullsFirst => first take all the nulls
        //natural order => for string lexicographic ordering (alphabetical)
        
        String[] arr2 = {"gfg", "courses", "ide"};

        
        Arrays.sort(arr2, Comparator.reverseOrder());  //Print reverse of natural order (decreasing alphabetically)
            
      
        System.out.println(Arrays.toString(arr2));
        
     // Arrays of Students with name and rollNo
        Student arr3[] = {new Student("abc", 120), 
                        new Student("xyz", 110), 
                        new Student("abc", 101)};
        
        // Sorting first by name and then by rollNo
        Arrays.sort(
            arr3, 
            Comparator.comparing(
                Student::getName).thenComparing(
                    Student::getRoll));
        
        // Displaying the Arrays
        System.out.println(Arrays.toString(arr3));

	}

}
