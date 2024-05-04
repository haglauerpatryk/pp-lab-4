import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("John Doe", 5000);
        employees[1] = new Worker("Jane Smith", 6000, "Developer");
        employees[2] = new Employee("Alice Johnson", 7000);
        employees[3] = new Worker("Bob Brown", 5500, "Designer");
        employees[4] = new Worker("Emily Davis", 6500, "Engineer");

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        }

        employees[0].setSalary(7500);

        System.out.println("Data for all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}