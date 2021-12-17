package Chapter3.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Doe", 1000);
        Employee employee2 = new Employee("Mike", "Johnson", 2000);

        System.out.printf("%s %s salary: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.yearlySalary());
        System.out.printf("%s %s salary: $%.2f%n%n", employee2.getFirstName(), employee2.getLastName(), employee2.yearlySalary(),
                employee2.getSalary());
        employee1.setSalary(employee1.getSalary() * 1.10);
        employee2.setSalary(employee2.getSalary() * 1.10);

        System.out.printf("%s %s salary: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.yearlySalary());
        System.out.printf("%s %s salary: $%.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.yearlySalary());

    }


}
