package sortingOfObjects;

import java.util.Arrays;
import java.util.Comparator;

class Employees implements Comparable<Employees> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employees(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
    /**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employees> SalaryComparator = new Comparator<Employees>() {

        @Override
        public int compare(Employees e1, Employees e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employees> AgeComparator = new Comparator<Employees>() {

        @Override
        public int compare(Employees e1, Employees e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employees> NameComparator = new Comparator<Employees>() {

        @Override
        public int compare(Employees e1, Employees e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
//    compare two Employees object first on their id and if they are same then on the name.
    public static Comparator<Employees> EmployeeComparatorByIdAndName = new Comparator<Employees>() {

        @Override
        public int compare(Employees e1, Employees e2) {
            int flag = e1.getId() - e2.getId();
            if(flag==0) flag = e1.getName().compareTo(e2.getName());
            return flag;
        }
    };

@Override
public int compareTo(Employees emp) {
	
	return (this.getId() - emp.getId());
}

}

public class Comparator_Example {

	public static void main(String[] args) {
		Employees[] empArr = new Employees[4];
        empArr[0] = new Employees(10, "Mikey", 25, 10000);
        empArr[1] = new Employees(20, "Arun", 29, 20000);
        empArr[2] = new Employees(5, "Lisa", 35, 5000);
        empArr[3] = new Employees(1, "Pankaj", 32, 50000);
        
        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, Employees.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Age
        Arrays.sort(empArr, Employees.AgeComparator);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employees.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
        
        //Employees list sorted by ID and then name using Comparator class
        empArr[0] = new Employees(1, "Mikey", 25, 10000);
        Arrays.sort(empArr, Employees.EmployeeComparatorByIdAndName);
        System.out.println("Employees list sorted by ID and Name:\n"+Arrays.toString(empArr));


	}

}
