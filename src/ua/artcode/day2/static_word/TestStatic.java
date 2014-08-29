package ua.artcode.day2.static_word;

import ua.artcode.day2.university_task.Subject;

import java.util.Arrays;

/**
 * Created by admin on 29.08.2014.
 */
public class TestStatic {
    public static void main(String[] args) {
        Subject.count++;

        Subject subject = new Subject();
        subject.nonStaticMethod();

        Subject.test();

    }
}
