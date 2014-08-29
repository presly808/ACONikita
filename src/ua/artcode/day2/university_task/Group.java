package ua.artcode.day2.university_task;

/**
 * Created by admin on 26.08.2014.
 */
public class Group {

    Student[] students = new Student[20];// null, null, null
    String name;// null
    int index = 0; // 0

    public void showStudents(){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public void addStudent(String name, int age){
        Student temp = new Student();
        temp.setName(name);
        temp.setAge(age);
        students[index] = temp;
        index++;
    }


}
