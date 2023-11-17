package hrapp.study;

public class Employee {
    private int ID;
    private String name;
    private double salary;

    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}