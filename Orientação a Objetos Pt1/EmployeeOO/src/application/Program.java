package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();

        System.out.println("Name: "+employee.name);
        System.out.printf("Gross Salary: %.2f%n", employee.grossSalary);
        System.out.printf("Tax: %.2f%n", employee.tax);
        System.out.println();
        System.out.println("Employee: "+employee);
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double increase = sc.nextDouble();
        employee.increaseSalary(increase);
        System.out.println("Updated Data: "+employee);




        sc.close();
    }
}
