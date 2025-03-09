import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList();

        emp.add(new Employee(BigInteger.valueOf(2), "A", 700, BigInteger.valueOf(100), Status.ACTIVE));
        emp.add(new Employee(BigInteger.valueOf(1), "B", 100, BigInteger.valueOf(100), Status.ACTIVE));
        emp.add(new Employee(BigInteger.valueOf(3), "C", 400, BigInteger.valueOf(100), Status.INACTIVE));

        emp.add(new Employee(BigInteger.valueOf(6), "D", 1000, BigInteger.valueOf(200), Status.ACTIVE));
        emp.add(new Employee(BigInteger.valueOf(8), "E", 2000, BigInteger.valueOf(200), Status.ACTIVE));
        emp.add(new Employee(BigInteger.valueOf(7), "F", 4000, BigInteger.valueOf(200), Status.INACTIVE));

        emp.add(new Employee(BigInteger.valueOf(10), "G", 10000, BigInteger.valueOf(300), Status.ACTIVE));
        emp.add(new Employee(BigInteger.valueOf(11), "H", 20000, BigInteger.valueOf(300), Status.ACTIVE));
        emp.add(new Employee(BigInteger.valueOf(12), "I", 40000, BigInteger.valueOf(300), Status.INACTIVE));

        System.out.println("Min/Max Salary Emp=====================");

        Optional<Employee> minSalary = emp.stream().min((i, j) -> i.getDeptId().compareTo(j.getDeptId()));
        Optional<Employee> maxSalary = emp.stream().max(new SalaryComparator());

        System.out.println("Min Salary Emp: " + minSalary.get());
        System.out.println("Max Salary Emp: " + maxSalary.get());

        System.out.println("Min/Max Dpt Salary Emp=====================");
        Map<BigInteger, List<Employee>> deptGroups = emp.stream().collect(Collectors.groupingBy(Employee::getDeptId));

        deptGroups.entrySet().stream().forEach(emplist -> {
            List<Employee> _empList = emplist.getValue();
            System.out.println("Min Salary for Dept ID : " + _empList.get(0).getDeptId());
            Optional<Employee> _minSalary = _empList.stream().min(new SalaryComparator());
            Optional<Employee> _maxSalary = _empList.stream().max(new SalaryComparator());
            System.out.println("Min Salary Emp: " + _minSalary.get());
            System.out.println("Max Salary Emp: " + _maxSalary.get());

        });

        System.out.println("Active Emp=====================");
        emp.stream().filter(e -> e.getStatus().equals(Status.ACTIVE)).forEach(System.out::println);

        System.out.println("InActive Emp=====================");
        emp.stream().filter(e -> e.getStatus().equals(Status.INACTIVE)).forEach(System.out::println);

        System.out.println("Emp in each department =====================");
        deptGroups.entrySet().stream().forEach(emplist -> {
            List<Employee> _empList = emplist.getValue();
            _empList.stream().forEach(System.out::println);
        });

        deptGroups.entrySet().stream().forEach(emplist -> {
            List<Employee> _empList = emplist.getValue();
            System.out.printf("Employees working in dept id %d is %d\n", _empList.get(0).getDeptId().intValue(),
                    _empList.size());
        });
    }

}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee arg0, Employee arg1) {
        return arg0.getSalary() - arg1.getSalary();
    }

}

enum Status {
    ACTIVE, INACTIVE,
}

class Employee {

    private BigInteger id;
    private String name;
    private int salary;
    private BigInteger deptId;
    private Status status;

    Employee(BigInteger id, String name, int salary, BigInteger deptId, Status status) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptId = deptId;
        this.status = status;
    }

    public BigInteger getId() {
        return id;
    }

    public BigInteger getDeptId() {
        return deptId;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + ", status="
                + status + "]";
    }
}
