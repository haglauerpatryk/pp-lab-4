public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Employee: {" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
