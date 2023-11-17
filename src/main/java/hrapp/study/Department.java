package hrapp.study;

public class Department {
    private String name;
    private final Employee[] employees = new Employee[10];
    private int lastEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        /* The int lastEmployeeIndex hold where the last employee was stored.
           Cant store more than 10 individuals, because of the array capacity.
           In the real world, could be used a List, that can be easily increased. */
        if (lastEmployeeIndex+1 < employees.length) {
            // Uses the method to find an employee and ensure that it's not already in the department
            if (getEmployeeById(employee.getID()) == null) {
                lastEmployeeIndex++;
                employees[lastEmployeeIndex] = employee;
            } else {
                System.out.println("Employee with ID " + employee.getID() +" is already in this Department.");
            }
        } else {
            System.out.println("Department is full.");
        }
    }

    /**
     * Will return an array only with the employees that work in department
     * The department has 10 possible positions, but if it has 2, the returned array will have 2 items
     * @return array with employees
     */
    public Employee[] getEmployees() {
        Employee[] employeesOnly = new Employee[lastEmployeeIndex+1];

        for (int i=0; i < employeesOnly.length; i++) {
            employeesOnly[i] = employees[i];
        }
        return employeesOnly;
    }

    public int getEmployeeCount() {
        /* The lastEmployee index contains the last position.
        *  Because the array starts at zero, we add 1 to return the number of employees */
        return lastEmployeeIndex+1;
    }

    public Employee getEmployeeById(int employeeId) {
        for (Employee employee : getEmployees()) {
            if (employee.getID() == employeeId)
                return employee;
        }
        return null;
    }

    /**
     * Calculate the sum of salaries and return the result
     * @return sum of employees salary
     */
    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i=0; i<=lastEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (lastEmployeeIndex > -1) {
            return getTotalSalary() / getEmployeeCount();
        }
        return 0.0;
    }

    public void printEmployeesDepartment() {
        for (Employee employee : getEmployees()) {
            System.out.println("Employee: " + employee);
        }
    }
}