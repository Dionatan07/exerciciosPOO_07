package entities;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount){
    salary += salary * amount / 100;
    }

    public double calcAnnualSalary(){
        return salary * 12;
    }

    public String toString(){
        return "Employee: " + firstName + " " + lastName + "\n"
                + "Salary $" + String.format("%.2f", calcAnnualSalary());
    }




}
