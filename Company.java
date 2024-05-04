import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("John Doe", 5000);
        employees[1] = new Worker("Jane Smith", 6000, "Developer");
        employees[2] = new Employee("Alice Johnson", 7000);
        employees[3] = new Worker("Bob Brown", 5500, "Designer");
        employees[4] = new Worker("Emily Davis", 6500, "Engineer");
        employees[5] = new Manager("Michael Clark", 6000);
        employees[6] = new Worker("David Lee", 5200, "Administrator");

        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary(currentSalary + 500);
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setNumberOfSubordinates(2);
                manager.setSalary(7500);
            }
        }

        System.out.println("Updated information for all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}