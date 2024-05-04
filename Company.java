import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("John Doe", 50000);
        employees[1] = new Worker("Jane Smith", 60000, "Developer");
        employees[2] = new Employee("Alice Johnson", 70000);
        employees[3] = new Worker("Bob Brown", 55000, "Designer");
        employees[4] = new Worker("Emily Davis", 65000, "Engineer");

        System.out.println("Data for all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}