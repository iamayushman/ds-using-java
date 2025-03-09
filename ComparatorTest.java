import java.util.*;

class ComparatorTest {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();
        l.add(new Employee("ayu6", 25));
        l.add(new Employee("ayu7", 20));
        l.add(new Employee("ayu8", 29));
        Collections.sort(l, new NameComparator());
        l.stream().forEach(System.out::println);
        Collections.sort(l, new AgeComparator());
        l.stream().forEach(System.out::println);
    }
}

class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class AgeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "" + this.name + " " + this.age;
    }

    public int compareTo(Employee e) {
        return this.age - e.age;
    }
}