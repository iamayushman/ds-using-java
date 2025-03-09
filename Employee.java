import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();
        l.add(new Employee("ayu1", 25));
        l.add(new Employee("ayu2", 20));
        l.add(new Employee("ayu3", 29));
        Collections.sort(l);
        l.stream().forEach(System.out::println);
    }
}

class Employee implements Comparable<Employee> {
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