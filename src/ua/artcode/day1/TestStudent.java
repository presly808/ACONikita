package ua.artcode.day1;

/**
 * Created by admin on 26.08.2014.
 */
public class TestStudent {

    public static void main(String[] args) {
        String s = "some";

        Student s1 = new Student();
        s1.name = "Anton";
        s1.age = 25;
        s1.groupNum = 12;
        s1.sayHello();

        Student s2 = new Student();
        s2.name = "Vitaliy";
        s2.age = 24;
        s2.groupNum = 34;
        s2.sayHello();



        // for create reference we use "new"
        //int[] mas = new int[21]; // Reference
        //int i = 5; // Primitive
    }
}
