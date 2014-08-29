package ua.artcode.day1;

import ua.artcode.day2.university_task.Group;
import ua.artcode.day2.university_task.Student;

import java.util.Scanner;

/**
 * Created by admin on 26.08.2014.
 */
public class Task1_2 {

    public static void main(String[] args) {

        Student student = new Student();

        /*
        * int[] mas = new int[10];
        * _ _ _ _ _ _ 0 0 0
         *
         * byte, short, int, long, char = 0
         * float, double = 0.0;
         * boolean = false
         *
         * Reference type default value is null
         *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Input group size");
        int size = sc.nextInt();
        Group group = new Group();

        for(int i = 0; i < size; i++){
            System.out.println("Input name of " + (i+1) +" student"); // String + int + String
            String name = sc.next();
            System.out.println("Input age of " + (i+1) +" student"); // String + int + String
            int age = sc.nextInt();

            group.addStudent(name, age);
        }

        System.out.println("\nSTUDENTS LIST");
        group.showStudents();


    }
}
