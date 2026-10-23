package com.demo;

import java.util.Scanner;
import java.util.TreeSet;

import com.model.Student;
import com.model.StudentByCityASC;
import com.model.StudentByIdASC;
import com.model.StudentByNameASC;
import com.model.StudentByPercentageASC;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> t = null;

        System.out.println("1. Id ASC");
        System.out.println("2. Id DESC");
        System.out.println("3. Name ASC");
        System.out.println("4. City ASC");
        System.out.println("5. City DESC");
        System.out.println("6. Percentage ASC");
        System.out.println("7. Percentage DESC");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
        case 1:
            t = new TreeSet<Student>(new StudentByIdASC());
            break;
        case 2:
            t = new TreeSet<Student>(new StudentByIdASC().reversed());
            break;
        case 3:
            t = new TreeSet<Student>(new StudentByNameASC());
            break;
        case 4:
            t = new TreeSet<Student>(new StudentByCityASC());
            break;
        case 5:
            t = new TreeSet<Student>(new StudentByCityASC().reversed());
            break;
        case 6:
            t = new TreeSet<Student>(new StudentByPercentageASC());
            break;
        case 7:
            t = new TreeSet<Student>(new StudentByPercentageASC().reversed());
            break;
        default:
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        t.add(new Student(19, "tilak", "udaipur", 89.32));
        t.add(new Student(5, "nayan", "kanpur", 85.19));
        t.add(new Student(12, "rohan", "delhi", 79.32));
        t.add(new Student(7, "smith", "rajkot", 91.19));
        t.add(new Student(3, "rakesh", "nanded", 61.32));
        t.add(new Student(14, "jatin", "sangli", 56.19));

        for (Student s : t)
            System.out.println(s);

        sc.close();
    }
}
