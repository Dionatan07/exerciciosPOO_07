package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees do you want to register? ");
        int n = key.nextInt();

        Employee employee = new Employee();

        for (int i = 0; i < n; i++) {
            key.nextLine();
            System.out.print("Enter employee's first name: ");
            String firstName = key.nextLine();

            System.out.print("Enter employee's last name: ");
            String lastName = key.nextLine();

            System.out.print("Enter the employee's monthly salary: ");
            double salary = key.nextDouble();

            System.out.println();

            employee = new Employee(firstName, lastName, salary);

            list.add(employee);

        }

        for (Employee emp : list) {
            System.out.println(emp);
            System.out.println("");
        }


        System.out.print("Enter the value to increase: ");
        double amount = key.nextDouble();

        System.out.println();
        for (Employee emp : list) {
            emp.increaseSalary(amount);
            System.out.println(emp);
            System.out.println("");
        }

    }
}
