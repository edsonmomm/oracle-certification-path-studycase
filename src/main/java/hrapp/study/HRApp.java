package hrapp.study;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp - Study Case");

        Department department1 = new Department("Sales");
        department1.addEmployee(new Employee(1150,"Tommy", 12578.0));
        department1.addEmployee(new Employee(1180,"Bianca", 13503.4));
        department1.addEmployee(new Employee(1280,"Jessica", 22003.12));

        // Try to include a new employee with same ID, should not add
        department1.addEmployee(new Employee(1280,"Jessica", 22003.12));

        System.out.println("Department '" + department1.getName() + "' has " + department1.getEmployeeCount() + " employee(s).");
        System.out.println("Department employees:");
        department1.printEmployeesDepartment();
        System.out.println("Total salary is $" + department1.getTotalSalary());
        System.out.println("Average salary is $" + department1.getAverageSalary());

        findAndPrintEmployee(department1,1180);
        findAndPrintEmployee(department1,1181);
    }

    private static void findAndPrintEmployee(Department department, int employeeId) {
        Employee foundEmployee = department.getEmployeeById(employeeId);
        if (foundEmployee != null) {
            System.out.println("Looked for employee " + employeeId + " and found.");
            System.out.println(foundEmployee);
        } else {
            System.out.println("Looked for employee " + employeeId + " and was not found.");
        }
    }
}