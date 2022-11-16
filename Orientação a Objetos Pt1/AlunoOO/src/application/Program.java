package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        stu.name = sc.nextLine();
        stu.grade1 = sc.nextDouble();
        stu.grade2 = sc.nextDouble();
        stu.grade3 = sc.nextDouble();
        if (stu.finalGrade()>60.0) {
            System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());
            System.out.println("PASS");
        }
        else {
            System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", stu.missingPoints());
        }


        sc.close();
    }
}
