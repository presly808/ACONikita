package ua.artcode.day2.university_task;

/**
 * Created by admin on 26.08.2014.
 */
public class TestStudent {

    public static void main(String[] args) {
        String s = "some";

        Subject s2 = new Subject();
        s2.name = "Algebra";
        s2.minDesiredHours = 50;

        Student s3 = new Student();

        Student s1 = new Student("Anton", 25, 12, s2);
        s1.study(56);

        // for create reference we use "new"
        //int[] mas = new int[21]; // Reference
        //int i = 5; // Primitive
    }
}
